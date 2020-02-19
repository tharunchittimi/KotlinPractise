package com.example.kotlinpractise

fun main(args: Array<String>) {
    multiplication(num = 77)
}

fun multiplication(num:Int) {

    for (i in 1..10) {
        val product = num * i
        println("$num * $i = $product")
    }
}