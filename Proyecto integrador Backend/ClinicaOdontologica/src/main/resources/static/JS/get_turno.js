window.addEventListener("load", function () {

    const url = "/turnos";
    const settings = {
    method: "GET",
    };

    fetch(url, settings)
    .then((response) => response.json())
    .then((data) => {
        let turnos = data;
        for (turno of turnos) {
            let table = document.querySelector(".tabla-turnos");
            let turnoRow = table.insertRow();
            let tr_id = "tr_" + turno.id;
            turnoRow.id = tr_id;

            let deleteButton = `<button id="btn-delete-${turno.id}" type="button" onclick="deleteBy(${turno.id})" class="btn btn-danger btn_delete">
                                        <i class="fa-solid fa-trash"></i>
                                </button>`;

            let updateButton = `<button id="btn_id_${turno.id}" type="button" onclick="findBy(${turno.id})" class="btn btn-primary btn_id" data-bs-toggle="modal" data-bs-target="#updateTurnoModal">
                                    <i class="fa-solid fa-pen"></i>
                                </button>`;

            turnoRow.innerHTML =   `<td class="centrado">${turno.id}</td>
                                    <td class="centrado">${turno.paciente.nombre} ${turno.paciente.apellido}</td>
                                    <td class="centrado">${turno.odontologo.nombre} ${turno.odontologo.apellido}</td>
                                    <td class="centrado">${turno.fechaTurno}</td>
                                    <td class="centrado">${turno.horaTurno}</td>
                                    <td>
                                        ${updateButton}
                                        ${deleteButton}
                                    </td>`;
        }
    });
});
