package com.example.kotlinpractise

import java.util.*

fun main(args: Array<String>) {
    linearSearch()
}

fun linearSearch() {
    var c = 0
    val n: Int
    val search: Int
    val array: IntArray

    val `in` = Scanner(System.`in`)
    println("Enter number of elements")
    n = `in`.nextInt()
    array = IntArray(n)

    println("Enter those $n elements")

    while (c < n) {
        array[c] = `in`.nextInt()
        c++
    }

    println("Enter value to find")
    search = `in`.nextInt()

    c = 0
    while (c < n) {
        if (array[c] == search)
        /* Searching element is present */ {
            println(search.toString() + " is present at location " + (c + 1) + ".")
            break
        }
        c++
    }
    if (c == n)
    /* Element to search isn't present */
        println("$search isn't present in array.")
}