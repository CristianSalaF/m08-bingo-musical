//ReadCsvLib
import java.nio.file.Paths
import kotlin.io.path.reader
import java.io.BufferedReader
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVFormat
import java.io.File

//Programa per llegir un csv amb cançons exportades d'Spotify
//Llegeix l'arxiu, i mostra les dades per pantalla
//Fa servir les llibreries d'Apache per a manegar fitxers CSV
fun main() {

    println("Hello too!")

    val bufferedReader = BufferedReader(Paths.get("data/csv/bingo_musical.csv").reader());
    val csvParser = CSVParser(bufferedReader, CSVFormat.DEFAULT);
    csvParser.forEach { csvLine -> println(csvLine) }
}