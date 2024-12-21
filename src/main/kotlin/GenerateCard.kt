import kotlin.random.Random
//package com.bingo


fun main(){
    //Columnes del cartró
    val columnes = 5
    //Files del cartró
    val rows = 3

    //Inicialització de variables
    var carton = Array(columnes) { Array<Int>(rows) { 0 } }
    //nombres que ja s'han fet servir (Inicialment cap)
    val usedNums = mutableListOf(0)

    //generació de nombres
    //Nou número que es generarà
    var newnum:Int = 0;

    //Recorregut per totes les files
    for (i in 0..rows-1){
        //Recorregut per totes les columnes de cada fila
        for (j in 0..columnes-1){
            //Si el número no s'ha generat ja, torna a generar un número
            while(usedNums.contains(newnum)){
                newnum = Random.nextInt(1, 91)
            }
            // Assignació del número generat prèviament
            carton[j][i]= newnum
            // Generació d'un nou número aleatori
            usedNums.add(newnum)

            //Per a cada columna es genera sempre un número aleatori extra  que no es farà servir
        }
    }

    //Guardar el cartró en format csv
    var toCsv: String ="";

    //Recòrrer totes les files
    for (i in 0..rows-1){
        //Recòrrer totes les columnes
        for (j in 0..columnes-1){
            //Guardar cadascun dels números
            toCsv = toCsv + carton[j][i].toString()
            //No posar la coma només al darrer element
            if(j != columnes-1){
                toCsv = toCsv + ","
            }
        }
        //Salt de línia quan
        toCsv= toCsv + "\n"
    }

    //Imprimeix a pantalla per provar
    println(toCsv)
}

