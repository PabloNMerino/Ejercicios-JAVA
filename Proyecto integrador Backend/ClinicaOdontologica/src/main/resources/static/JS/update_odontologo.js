window.addEventListener('load', function () {

    const formulario = document.querySelector('#form-odontologo-upd');

    formulario.addEventListener('submit', function (event) {
        event.preventDefault();

        const formData = {
            id: document.querySelector('#odontologoUpd-id').value,
            matricula: document.querySelector('#odontologoUpd-matricula').value,
            nombre: document.querySelector('#odontologoUpd-nombre').value,
            apellido: document.querySelector('#odontologoUpd-apellido').value,
        };

        const url = '/odontologos';
        const settings = {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }
        fetch(url,settings)
        .then(response => {
            response.json()
            Swal.fire({
                position: 'center',
                icon: 'success',
                title: 'Odontologo actualizado exitosamente',
                showConfirmButton: false,
                timer: 1500,
                willClose: () => {
                    location.reload();
                }
            })
        })

    })
})


function findBy(id) {
    const url = `/odontologos/${id}`;
    const settings = {
        method: 'GET'
    }
    fetch(url,settings)
    .then(response => response.json())
    .then(data => {
        let odontologo = data;
        document.querySelector('#odontologoUpd-id').value = odontologo.id;
        document.querySelector('#odontologoUpd-nombre').value = odontologo.nombre;
        document.querySelector('#odontologoUpd-apellido').value = odontologo.apellido;
        document.querySelector('#odontologoUpd-matricula').value = odontologo.matricula;
    }).catch(error => {
        alert("Error: " + error);
    })
}