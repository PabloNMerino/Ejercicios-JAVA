window.addEventListener("load", function () {

    const formulario = document.querySelector("#form-paciente-reg");

    formulario.addEventListener("submit", function (event) {
    event.preventDefault();

    const formData = {
        nombre: document.querySelector("#paciente-nombre").value,
        apellido: document.querySelector("#paciente-apellido").value,
        email: document.querySelector("#paciente-email").value,
        dni: document.querySelector("#paciente-dni").value,
        fechaDeIngreso: document.querySelector("#paciente-fechadeingreso").value,
        domicilio: {
            calle: document.querySelector("#paciente-calle").value,
            numero: document.querySelector("#paciente-numero").value,
            localidad: document.querySelector("#paciente-localidad").value,
            provincia: document.querySelector("#paciente-provincia").value,
        }
        
    };

    const url = "/pacientes";
    const settings = {
        method: "POST",
        headers: {
        "Content-Type": "application/json",
        },
        body: JSON.stringify(formData),
    };

    fetch(url, settings)
        .then((response) =>{
            response.json()
            Swal.fire({
                position: 'center',
                icon: 'success',
                title: 'Paciente creado exitosamente',
                showConfirmButton: false,
                timer: 1500,
                willClose: () => {
                    location.reload();
                }
            })
        })
        .catch((error) => {
            resetUploadForm();
        });

    });

    function resetUploadForm() {
        document.querySelector("#paciente-nombre").value = "";
        document.querySelector("#paciente-apellido").value = "";
        document.querySelector("#paciente-email").value = "";
        document.querySelector("#paciente-dni").value = "";
        document.querySelector("#paciente-fechadeingreso").value = "";
        document.querySelector("#paciente-calle").value = "";
        document.querySelector("#paciente-numero").value = "";
        document.querySelector("#paciente-localidad").value = "";
        document.querySelector("#paciente-provincia").value = "";
        }
});