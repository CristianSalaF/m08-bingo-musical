import kotlin.random.Random
//package com.bingo


fun main(){
    val Columns: Int = 9;
    val Rows: Int = 3;

    var Carton = Array(Columns) { Array<Int>(Rows) { 0 } }
    var CorrectFormat: Boolean = false
    while (!CorrectFormat) {
        Carton = NewCard(Carton)
        CorrectFormat = FormatVoids(Carton)
        println(CorrectFormat)
    }

    var num :Int = 0;
    //Carton = NewCard(Carton)
    for (i in 0..Carton.lastIndex){
        for(element in Carton[i]){

            print(element)
        }
        println("")
    }

}
fun FormatVoids( Carton:  Array<Array<Int>>): Boolean{
    var count: Int = 0;
    count = 0;
    for (i in 0..3){
        for (j in 0..Carton.lastIndex){
            if(Carton[j][i] == 9){
                count = count + 1
            }
        }
        println("count per line ------------->" + count)
        if (count > 4){
            return false;
        }

        count = 0;
    }
    return true
}
fun NewCard(Carton:  Array<Array<Int>>):  Array<Array<Int>>{
    for (i in 0..Carton.lastIndex) {
        Carton[i][Random.nextInt(0, 3)] = 9;
    }
    return Carton
}