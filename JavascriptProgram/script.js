document.getElementById("fileInput").addEventListener("change", (event) => {
    const archivo = event.target.files[0];
    if (archivo) {
        const lector = new FileReader();
        lector.onload = (e) => mostrarTabla(e.target.result);
        lector.readAsText(archivo);
    }
});

function mostrarTabla(csv) {
    const filas = csv.trim().split("\n").filter(fila => fila.length > 0);
    const tabla = document.getElementById("csvTable");
    tabla.innerHTML = "";  // Limpiar tabla previa

    filas.forEach((fila, indice) => {
        // Si es la cuarta fila (incluyendo encabezado), agrega fila separadora
        if (indice > 0 && indice % 3 === 0) {
            agregarSeparador(tabla, filas[0].split(",").length);
        }

        // Crear fila actual
        const columnas = fila.split(",");
        const filaHTML = tabla.insertRow();

        columnas.forEach((columna) => {
            const celda = filaHTML.insertCell();
            celda.textContent = columna.trim();
            celda.style.padding = "8px";
            celda.style.textAlign = "left";
            celda.style.border = "1px solid #ddd";
        });
    });
}

// Agrega una fila separadora
function agregarSeparador(tabla, columnas) {
    const separador = tabla.insertRow();
    const celdaSeparadora = separador.insertCell();
    celdaSeparadora.colSpan = columnas;
    celdaSeparadora.style.backgroundColor = "#f0f0f0";
    celdaSeparadora.style.height = "10px";
}
