package com.example.kotlinpractise

fun main(args: Array<String>) {
    factorial()
}

fun factorial() {
    val num = 10
    var factorial: Long = 10
    for (i in 1..num) {
        factorial *= i.toLong()
        println("Factorial is $num = $factorial")
    }
}