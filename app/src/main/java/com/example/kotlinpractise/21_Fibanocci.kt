package com.example.kotlinpractise

fun main(args: Array<String>) {
    fibanocci()
}

fun fibanocci() {
    var i = 1
    val n = 10
    var t1 = 0
    var t2 = 1
    print("First $n terms: ")
    while (i <= n) {
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
        i++
    }
}