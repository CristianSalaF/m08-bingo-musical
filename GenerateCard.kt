import kotlin.random.Random


fun main(){
    val Columns: Int = 9;
    val Rows: Int = 3;




    val Carton = Array(Columns) { Array<Int>(Rows) { 0 } }

    for (i in 0..Carton.lastIndex){
       Carton[i][ Random.nextInt(0, 3)] = 9;

    }
    for (i in 0..Carton.lastIndex){
        for(element in Carton[0]){
            print(element)
        }
        println("")
    }

}