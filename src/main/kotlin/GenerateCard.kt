import kotlin.random.Random
//package com.bingo


fun main(){
    val Columns: Int = 5;
    val Rows: Int = 3;

    var Carton = Array(Columns) { Array<Int>(Rows) { 0 } }
    val UsedNums = mutableListOf(0)

    var newnum:Int = 0;
    for (i in 0..Rows-1){
        for (j in 0..Columns-1){
            while(UsedNums.contains(newnum)){
                newnum = Random.nextInt(0, 100)
            }
            Carton[j][i]= newnum
            UsedNums.add(newnum)
        }
    }
    var ToCsv: String ="";
    for (i in 0..Rows-1){
        for (j in 0..Columns-1){

            ToCsv = ToCsv + Carton[j][i].toString()
            if(j != Columns-1){
                ToCsv = ToCsv + ","
            }
        }
        ToCsv= ToCsv + "\n"
    }
    println(ToCsv)



}

