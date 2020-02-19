package com.example.kotlinpractise

fun main(args: Array<String>) {
    pyramidNumbers()
}

fun pyramidNumbers() {
    val rows = 6
    var num = 1
    for (i in 0 until rows) {
        for (k in 1 until rows - i) {
            print("  ")
        }
        for (j in 0..i) {
            if (j == 0 || i == 0)
                num = 1
            else
                num = num * (i - j + 1) / j
            System.out.printf("%4d", num)
        }
        println()
    }
}