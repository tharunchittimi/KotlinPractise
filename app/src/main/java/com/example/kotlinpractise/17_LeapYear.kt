package com.example.kotlinpractise

fun main(args:Array<String>){
    leapYear(year = 2019)
}

fun leapYear(year:Int){

    val leap: Boolean = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }
    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}