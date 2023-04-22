window.addEventListener('load', function () {

    const formulario = document.querySelector('#form-paciente-upd');

    formulario.addEventListener('submit', function (event) {
        event.preventDefault();

        const formData = {
            id: document.querySelector('#pacienteUpd-id').value,
            nombre: document.querySelector("#pacienteUpd-nombre").value,
            apellido: document.querySelector("#pacienteUpd-apellido").value,
            email: document.querySelector("#pacienteUpd-email").value,
            dni: document.querySelector("#pacienteUpd-dni").value,
            fechaDeIngreso: document.querySelector("#pacienteUpd-fechadeingreso").value,
            domicilio: {
                calle: document.querySelector("#pacienteUpd-calle").value,
                numero: document.querySelector("#pacienteUpd-numero").value,
                localidad: document.querySelector("#pacienteUpd-localidad").value,
                provincia: document.querySelector("#pacienteUpd-provincia").value,
            }
            
        };

        const url = '/pacientes';
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
                title: 'Paciente actualizado exitosamente',
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
    const url = `/pacientes/${id}`;
    const settings = {
        method: 'GET'
    }
    fetch(url,settings)
    .then(response => response.json())
    .then(data => {
        let paciente = data;
        document.querySelector('#pacienteUpd-id').value = paciente.id;
        document.querySelector('#pacienteUpd-nombre').value = paciente.nombre;
        document.querySelector('#pacienteUpd-apellido').value = paciente.apellido;
        document.querySelector("#pacienteUpd-email").value =paciente.email;
        document.querySelector("#pacienteUpd-dni").value =paciente.dni;
        document.querySelector("#pacienteUpd-fechadeingreso").value =paciente.fechaDeIngreso;
        document.querySelector("#pacienteUpd-calle").value =paciente.domicilio.calle;
        document.querySelector("#pacienteUpd-numero").value =paciente.domicilio.numero;
        document.querySelector("#pacienteUpd-localidad").value =paciente.domicilio.localidad;
        document.querySelector("#pacienteUpd-provincia").value =paciente.domicilio.provincia;
    }).catch(error => {
        alert("Error: " + error);
    })
}