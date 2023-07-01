package com.example.kotlinprogramminglanguage

fun main(){

//  ----------------------------------------> Array <--------------------------------------------

    var technologies_1 = arrayOf("Java", "Kotlin", "XML", "Android Studio", "API", "Room Database", "Firebase", "SQL")
    var technologies_2 = arrayOf("HTML", "CSS", "JavaScript", "DOM", "API", "React", "Node", "Express", "Firebase", "Mongodb", "JWT")

    // println(technologies_1.contentToString())
    // println(technologies_2.contentToString())

    // println("For android development")
    for (element in technologies_1){
        // println(element)
    }

    // println("For MERN development")
    for (element in technologies_2){
        // println(element)
    }

    var newTechs = arrayOf("MySQL", "Hosting", "Animation", "Library", "Git")
    var additionalTech = technologies_2.toMutableList()
    additionalTech.addAll(newTechs)
//    println(additionalTech)

    technologies_1[3]="Python"
    technologies_1[6]="Django"
    // println(technologies_1.contentToString())



//  ----------------------------------------> List <--------------------------------------------

    var cities = listOf("New York", "Miami", "Los Angelos", "Boston", "San Diego", "London")
//    println(cities)

    var newCities = listOf("Toronto", "Sydney", "Ontario", "Paris", "Berlin", "Frankfort")
    var addedCities = cities.toMutableList()
    addedCities.addAll(newCities)
//    println(addedCities)

    var moreCities = listOf("Austin", "Quebec", "Waterloo", "Washington DC", "Singapore", "Canberra", "Perth")
    addedCities.addAll(moreCities)
    var allCities = addedCities

    var i = 0
    for (city in allCities){
//        println("${++i}: $city")
    }


//  ----------------------------------------> Set <--------------------------------------------

    var countries = setOf("US", "UK", "Japan", "Switzerland", "US", "Bangladesh", "Japan", "Canada", "Germany", "UK", "Australia")
    println(countries)

    println(countries.sorted())


//  ----------------------------------------> Map <--------------------------------------------

    val goals = mapOf(1 to "MERN Stack", 2 to "Android Development", 3 to "Machine Learning", 4 to "Thesis", 5 to "Job", 6 to "Django", 7 to "IELTS" )
    for((key, value) in goals){
        println("the number $key goal is $value")
    }

    val countriesMap = mapOf(
        "Dream" to Country("USA", "Washington DC", 339.9, 26.8),
        "Goal" to  Country("Canada", "Toronto", 38.9, 2.0),
        "Choice" to  Country("UK", "London", 68.8, 3.2),
        "Option" to  Country("Germany", "Berlin", 83.8, 4.5),
    )
    for ((key, country) in countriesMap){
//        println("It is a $key to go to ${country.name}")
    }

    val otherOptions = mapOf(
        "OK" to Country("Italy", "Rome", 58.6, 2.2),
    )

    var allCountriesMap = countriesMap.toMutableMap()
    allCountriesMap.putAll(otherOptions)

    for ((key, country) in allCountriesMap){
        println("It's $key to go to ${country.name}")
    }

}

data class Country(val name: String, val capital: String, val population: Double, val gdp: Double)