window.addEventListener("load", function () {

    const formulario = document.querySelector("#form-turno-reg");

    formulario.addEventListener("submit", function (event) {
    event.preventDefault();

    const formData = {
        paciente:{
            id: document.querySelector("#turno-pacienteid").value
        },
        odontologo:{
            id: document.querySelector("#turno-odontologoid").value
        },
        fechaTurno: document.querySelector("#turno-fecha").value,
        horaTurno: document.querySelector("#turno-hora").value,
    };

    const url = "/turnos";
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
                title: 'Turno creado exitosamente',
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
        document.querySelector("#turno-pacienteid").value = "";
        document.querySelector("#turno-odontologoid").value = "";
        document.querySelector("#turno-fecha").value = "";
        document.querySelector("#turno-hora").value = "";
    }
});