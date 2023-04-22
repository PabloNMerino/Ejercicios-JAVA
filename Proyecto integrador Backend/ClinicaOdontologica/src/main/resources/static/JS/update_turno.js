window.addEventListener('load', function () {

    const formulario = document.querySelector('#form-turno-upd');

    formulario.addEventListener('submit', function (event) {
        event.preventDefault();

        const formData = {
            id: document.querySelector('#turnoUpd-id').value,
            paciente:{
                id: document.querySelector("#turnoUpd-pacienteid").value
            },
            odontologo:{
                id: document.querySelector("#turnoUpd-odontologoid").value
            },
            fechaTurno: document.querySelector("#turnoUpd-fecha").value,
            horaTurno: document.querySelector("#turnoUpd-hora").value,
        };

        const url = '/turnos';
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
                title: 'Turno actualizado exitosamente',
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
    const url = `/turnos/${id}`;
    const settings = {
        method: 'GET'
    }
    fetch(url,settings)
    .then(response => response.json())
    .then(data => {
        let odontologo = data;
        document.querySelector('#turnoUpd-id').value = turno.id;
        document.querySelector('#turnoUpd-pacienteid').value = turno.paciente.id;
        document.querySelector('#turnoUpd-odontologoid').value = turno.odontologo.id;
        document.querySelector('#turnoUpd-fecha').value = turno.fechaTurno;
        document.querySelector('#turnoUpd-hora').value = turno.horaTurno;
    }).catch(error => {
        alert("Error: " + error);
    })
}