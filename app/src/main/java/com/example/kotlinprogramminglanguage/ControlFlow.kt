package com.example.kotlinprogramminglanguage

fun main(){

    // if-else statement
    val a = 12
    val b = 10

    if(a == b){
        println("1: $a & $b Both are equal")
    }
    else if (a > b){
        println("2: $a is greater than $b")
    }
    else{
        println("3: $b is greater than $a")
    }

    // -------------------------------------------------------------------------------------

    // when statement
    val season = 2
    when(season){

        in 2..4 -> println("Spring")
        in 5..7 -> println("Summer")
        in 8..11 -> println("Autumn + Rainy")
        12, 1 -> println("Winter")

    }

}