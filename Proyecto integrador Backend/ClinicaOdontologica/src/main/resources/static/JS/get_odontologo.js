window.addEventListener("load", function() {
  console.log("entra 1");

  const url = "/odontologos";
  const settings = {
    method: "GET",
  };

  fetch(url, settings)
    .then(response => response.json())
    .then(data => {
      let odontologos = data
      console.log(odontologos)
      for (odontologo of odontologos) {
        let table = document.querySelector(".tabla-odontologos");
        let odontologoRow = table.insertRow();
        let tr_id = "tr_" + odontologo.id;
        odontologoRow.id = tr_id;

        let deleteButton = `<button id="btn-delete-${odontologo.id}" type="button" onclick="deleteBy(${odontologo.id})" class="btn btn-danger btn_delete">
                                  <i class="fa-solid fa-trash"></i>
                                </button>`;

        let updateButton = `<button id="btn_id_${odontologo.id}" type="button" onclick="findBy(${odontologo.id})" class="btn btn-primary btn_id" data-bs-toggle="modal" data-bs-target="#updateOdontologoModal">
                                  <i class="fa-solid fa-pen"></i>
                                </button>`;

        odontologoRow.innerHTML = ` <td class="centrado">${odontologo.id}</td>
                                        <td class="centrado">${odontologo.nombre}</td>
                                        <td class="centrado">${odontologo.apellido}</td>
                                        <td class="centrado">${odontologo.matricula}</td>
                                        <td>
                                          ${updateButton}
                                          ${deleteButton}
                                        </td>`;
      }
    });
});
