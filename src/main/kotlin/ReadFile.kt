import java.io.File

//Funció per a llegir les dades d'un arxiu
//Llegeix les dades i les mostra per pantalla
//No fa tractament cd CSV.  El nom de l'arxiu podria ser un paràmetre de la funció
fun readCsv() {
    try {
        val fileName = "data/csv/bingo_musical.csv"
        var lines:List<String> = File(fileName).readLines()
        lines.forEach { line -> println(line) }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
