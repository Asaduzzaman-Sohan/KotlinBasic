package com.example.kotlinprogramminglanguage

fun main(){

    // while loop
    var i = 1
    while (i <= 100){
        if (i % 2 == 0) {
            println(i)
            if (i == 52)
                break
        }
        i++
    }

    // for loop
    println("\n--------------------> Table of 8 <---------------------")
    for (i in 1..10 ){
        val x = 8
        println("$x x $i = ${x*i}")
    }

    println("\n--------------------> Table of 7 <---------------------")
    for (x in 1 until 10){
        val i = 7
        println("$i x $x = ${x*i}")
    }



}