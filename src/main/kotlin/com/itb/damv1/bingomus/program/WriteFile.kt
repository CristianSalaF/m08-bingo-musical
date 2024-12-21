package com.itb.damv1.bingomus.program

import com.itb.damv1.bingomus.model.Carto
import java.io.FileOutputStream

/*
Això és una extensió de funció.
En aquest cas ens facilita que no hem de crear un objecte bufferedWriter, ja que la propia classe
OutputStream té un mètode per a obtenir un bufferedWriter.  A més, com el cridem dintre d'un mètode,
no hem de posar el nom de l'objecte.
La he convertit en FileOutputStream per no haver de fer servir el mètode apply.
El mètode apply (de la classe any) que es feia servir en en la crida, es feia servir per qué des
d'una classe filla no es pot accedir directament als mètodes de la super classe.
 */
fun FileOutputStream.writeCsv(cartons: List<Carto>) {

    //Obrir escriptor
    val writer = bufferedWriter()
    //Escriure la capçalera del fitxer
    writer.write(""""Fila 1", "Fila 2", "Fila 3"""")
    writer.newLine()

    //Per a cada cartró, escriure en una línia totes les seves dades
    cartons.forEach {
        writer.write("${it.fila1}, ${it.fila2}, \"${it.fila3}\"")
        writer.newLine()
    }

    //Buidar el writer
    writer.flush()
}

fun main() {

    //Crear un objecte de tipus cartró
    val fila1 = arrayListOf(3,5,1)
    val fila2 = arrayListOf(5,2,2)
    val fila3 = arrayListOf(3,9,1)
    val cartons = arrayListOf (
        Carto(fila1, fila2, fila3),
        Carto(fila1, fila2, fila3)
    )

    //Escriure els cartrons en un arxiu (no és format csv)
    FileOutputStream("data/csv/filename.csv").writeCsv(cartons)

    //Llegir l'arxiu i escriure per pantalla per provar
    //readCsv()
}

