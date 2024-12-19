document.getElementById("fileInput").addEventListener("change", cargarCSV);

function cargarCSV(event) {
    const archivo = event.target.files[0];
    if (!archivo) {
        alert("Selecciona un archivo CSV.");
        return;
    }

    const lector = new FileReader();
    lector.onload = function (e) {
        const contenido = e.target.result;
        mostrarTabla(contenido);
    };
    lector.readAsText(archivo);
}

function mostrarTabla(csv) {
    const filas = csv.split("\n").filter(fila => fila.trim() !== "");
    const tabla = document.getElementById("csvTable");

    // Limpiar tabla antes de mostrar
    tabla.innerHTML = "";

    filas.forEach((fila, indice) => {
        const columnas = fila.split(",");

        const filaHTML = tabla.insertRow();
        columnas.forEach(columna => {
            const celda = filaHTML.insertCell();
            celda.textContent = columna.trim();
            celda.style.padding = "8px";
            celda.style.textAlign = "left";
            celda.style.border = "1px solid #ddd";
        });
    });
}
