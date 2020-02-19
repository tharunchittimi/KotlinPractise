package com.example.kotlinpractise
// basic usage of enum classes is implementing type-safe enums
//Enum entries cannot contain nested types other than inner classes (deprecated in Kotlin 1.2).
enum class Day { //Each enum constant is an object. Enum constants are separated with commas
    MON, TUE, WED, THU, FRI, SAT, SUN
}

fun printEnum() {
    val currentDay = Day.WED

    for (d in Day.values()) {
        println("Day : $d")
    }
    println("currentDay :$currentDay") //here prints current day as mentioned above

    when (currentDay) {
        Day.MON, Day.TUE, Day.WED, Day.THU, Day.FRI -> println("Weekdays")
        Day.SAT, Day.SUN -> println("Weekend")
    }
}

fun main() {
    printEnum()
}
