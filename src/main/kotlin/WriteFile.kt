import java.io.FileOutputStream
import java.io.OutputStream

fun OutputStream.writeCsv(cartons: List<Carto>) {

    //Obrir escriptor
    val writer = bufferedWriter()
    //Escriure la capçalera del fitxer
    writer.write(""""Fila 1", "Fila 2", "Fila 3"""")
    writer.newLine()

    //Per a cada cartró, escriure en una línia totes les seves dades
    cartons.forEach {
        writer.write("${it.fila1}, ${it.fila2}, \"${it.fila3}\"")
        writer.newLine()
    }

    //Buidar el writer
    writer.flush()
}

fun main() {

    //Crear un objecte de tipus cartró
    val fila1 = arrayListOf(3,5,1)
    val fila2 = arrayListOf(5,2,2)
    val fila3 = arrayListOf(3,9,1)
    val cartons = arrayListOf (
        Carto(fila1, fila2, fila3),
        Carto(fila1, fila2, fila3)
    )

    //Escriure els cartrons en un arxiu (no és format csv)
    FileOutputStream("filename.csv").apply { writeCsv(cartons) }

    //Llegir l'arxiu i escriure per pantalla per provar
    //readCsv()
}

