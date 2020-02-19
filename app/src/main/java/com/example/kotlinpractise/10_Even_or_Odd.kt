package com.example.kotlinpractise

import java.util.*

fun main(args: Array<String>) {
    evenOrOdd()
}

fun evenOrOdd() {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val num = reader.nextInt()
    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}