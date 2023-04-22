window.addEventListener("load", function () {

    const formulario = document.querySelector("#form-odontologo-reg");

    formulario.addEventListener("submit", function (event) {
    event.preventDefault();

    const formData = {
        matricula: document.querySelector("#odontologo-matricula").value,
        nombre: document.querySelector("#odontologo-nombre").value,
        apellido: document.querySelector("#odontologo-apellido").value
    };

    const url = "/odontologos";
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
                title: 'Odontologo creado exitosamente',
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
        document.querySelector("#odontologo-matricula").value = "";
        document.querySelector("#odontologo-nombre").value = "";
        document.querySelector("#odontologo-apellido").value = "";
    }
});
