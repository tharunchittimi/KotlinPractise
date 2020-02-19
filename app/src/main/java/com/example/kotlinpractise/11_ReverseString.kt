package com.example.kotlinpractise

fun main(args: Array<String>) {
    reverseString(str = "CompIndia")
}

fun reverseString(str: String) {
    var builder: StringBuilder = java.lang.StringBuilder()
    builder.append(str)
    builder = builder.reverse()
    println(builder)
}
