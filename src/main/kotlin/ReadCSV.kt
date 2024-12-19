import java.io.FileOutputStream
import java.io.OutputStream

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
    val fila1 = arrayListOf(3,5,1)
    val fila2 = arrayListOf(5,2,2)
    val fila3 = arrayListOf(3,9,1)
    val cartons = arrayListOf (
        Carto(fila1, fila2, fila3),
        Carto(fila1, fila2, fila3)
    )
    FileOutputStream("filename.csv").apply { writeCsv(cartons) }
}

