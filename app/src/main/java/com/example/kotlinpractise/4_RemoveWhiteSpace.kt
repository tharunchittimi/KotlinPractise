package com.example.kotlinpractise

fun main(args: Array<String>) {
    removeWhiteSpace(str = "Th  a ru n          D el            Ri o")
}

fun removeWhiteSpace(str: String) {

    val char: CharArray = str.toCharArray()
    val builder: StringBuilder = StringBuilder()
    for (i in char.indices) {
        if ((char[i] != ' ')) {
            builder.append(char[i])
        }
    }
    println(builder)
}