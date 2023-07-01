package com.example.kotlinprogramminglanguage

fun main(){

//    All types of variables

    var byteVar: Byte = 127
    var shortVar: Short =21723
    var longVar: Long = 128218378178732
    var charVar: Char = 'A'

    var stringVar: String = "String"
    var intVar: Int = 12
    var doubleVar: Double = 3.1416
    var floatVar: Float = 3.1416F
    var boolVar: Boolean = true
//=======================================================================================//

//     Declare variables in Kotlin

    val firstName: String = "Asaduzzaman"
    val lastName: String = "Sohun"
    val age: Int = 21
    val weight: Double = 65.00
    val hasGoal: Boolean = true
    val goal: String = "Android App Developer"

    println("My name is $firstName $lastName. I'm $age years old. My weight is $weight. Yes! I have " +
            "a goal, it's $hasGoal. I want to become an $goal")

    // Differences Between var & val is
    // var is mutable so we can change its value later if needed.
    // val is immutable. so we cannot redeclare, once it declared.
// -----------------------------------------------------------------------------------//

    // Simple way to declare variables

    val name = "Kotlin Programming Language"
    val year = 2023
    val version = 1.9
    var grade = 'A'
    var skill = "Android App Development"
    skill = "Android App Development with Kotlin"


}