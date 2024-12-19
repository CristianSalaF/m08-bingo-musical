fun OutputStream.writeCsv(cartons: List<Carto>) {
    val writer = bufferedWriter()
    writer.write(""""Fila 1", "Fila 2", "Fila 3"""")
    writer.newLine()
    cartons.forEach {
        writer.write("${it.fila1}, ${it.fila2}, \"${it.fila3}\"")
        writer.newLine()
    }
    writer.flush()
}
fun main() {
    val fila1 = "3, 5, 1"
    val fila2 = "5, 2, 2"
    val fila3 = "5, 3, 2"
    val cartons = Carto(fila1, fila2, fila3)
}
FileOutputStream("filename.csv").apply { writeCsv(cartons) }
