import kotlin.random.Random
//package com.bingo


fun main(){
    val columnes = 5
    val rows = 3

    var carton = Array(columnes) { Array<Int>(rows) { 0 } }
    val usedNums = mutableListOf(0)

    var newnum:Int = 0;
    for (i in 0..rows-1){
        for (j in 0..columnes-1){
            while(usedNums.contains(newnum)){
                newnum = Random.nextInt(0, 100)
            }
            carton[j][i]= newnum
            usedNums.add(newnum)
        }
    }
    var toCsv: String ="";
    for (i in 0..rows-1){
        for (j in 0..columnes-1){

            toCsv = toCsv + carton[j][i].toString()
            if(j != columnes-1){
                toCsv = toCsv + ","
            }
        }
        toCsv= toCsv + "\n"
    }
    println(toCsv)



}

