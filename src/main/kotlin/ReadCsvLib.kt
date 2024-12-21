//ReadCsvLib
import java.nio.file.Paths
import kotlin.io.path.reader
import java.io.BufferedReader
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVFormat


fun main() {
    println("Hello too!")

    val bufferedReader = BufferedReader(Paths.get("./bingo_musical.csv").reader());
    val csvParser = CSVParser(bufferedReader, CSVFormat.DEFAULT);
    csvParser.forEach { csvLine -> println(csvLine) }
}