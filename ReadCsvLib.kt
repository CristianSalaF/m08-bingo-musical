package org.example
import java.nio.file.Paths
import org.apache.commons.csv.*
import java.io.BufferedReader
import kotlin.io.path.reader

data class Music (
    val trackId: Int,
    val trackName: String,
)

fun main() {
    val bufferedReader = BufferedReader(Paths.get("./bingo_musical.csv").reader());
    val csvParser = CSVParser(bufferedReader, CSVFormat.DEFAULT);
    csvParser.forEach { csvLine -> println(csvLine) }
}