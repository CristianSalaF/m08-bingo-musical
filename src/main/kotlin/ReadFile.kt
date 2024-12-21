import java.io.File

fun readCsv() {
    try {
        val fileName = "bingo_musical.csv"
        var lines:List<String> = File(fileName).readLines()
        lines.forEach { line -> println(line) }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
