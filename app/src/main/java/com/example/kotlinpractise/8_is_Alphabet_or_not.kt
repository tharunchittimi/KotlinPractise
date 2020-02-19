package com.example.kotlinpractise

fun main(args: Array<String>) {
    isAlphabetOrNot()
}

fun isAlphabetOrNot() {
    val c = '9'
    when {
        (c in 'a'..'z' || c in 'A'..'Z')
        -> println("$c is an alphabet.")
        else
        -> println("$c is not an alphabet.")
    }
}