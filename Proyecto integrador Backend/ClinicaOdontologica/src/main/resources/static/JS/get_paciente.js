window.addEventListener("load", function () {

    const url = "/pacientes";
    const settings = {
    method: "GET",
    };

    fetch(url, settings)
    .then((response) => response.json())
    .then((data) => {
        let pacientes = data;
        for (paciente of pacientes) {
            let table = document.querySelector(".tabla-pacientes");
            let pacienteRow = table.insertRow();
            let tr_id = "tr_" + paciente.id;
            pacienteRow.id = tr_id;

            let deleteButton = `<button id="btn-delete-${paciente.id}" type="button" onclick="deleteBy(${paciente.id})" class="btn btn-danger btn_delete">
                                    <i class="fa-solid fa-trash"></i>
                                </button>`;


            let updateButton = `<button id="btn_id_${paciente.id}" type="button" onclick="findBy(${paciente.id})" class="btn btn-primary btn_id" data-bs-toggle="modal" data-bs-target="#updatePacienteModal">
                                    <i class="fa-solid fa-pen"></i>
                                </button>`;

            pacienteRow.innerHTML = `   <td class="centrado">${paciente.id}</td>
                                        <td class="centrado">${paciente.nombre}</td>
                                        <td class="centrado">${paciente.apellido}</td>
                                        <td class="centrado">${paciente.dni}</td>
                                        <td class="centrado">${paciente.email}</td>
                                        <td class="centrado">${paciente.fechaDeIngreso}</td>
                                        <td class="centrado">${paciente.domicilio.calle} ${paciente.domicilio.numero}, ${paciente.domicilio.localidad}, ${paciente.domicilio.provincia}</td>
                                        <td>
                                            ${updateButton}
                                            ${deleteButton}
                                        </td>`;
        }
    });
});
