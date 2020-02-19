package com.example.kotlinpractise

fun main(args: Array<String>) {
    rightAngleTriangleNumbers(rows = 5)
}

fun rightAngleTriangleNumbers(rows:Int) {

    var number = 1
    for (i in 1..rows) {
        for (j in 1..i) {
            print("$number ")
            ++number
        }
        println()
    }
}
