package com.example.kotlinpractise

fun main(args: Array<String>) {
    sandGlassTop()
}
fun sandGlassTop(){

    for (i in 5 downTo 0) {
        for (k in 5 downTo i) {
            print(" ")
        }
        for (j in 2 * i downTo 0) {
            print("*")
        }
        println()
    }
    sandGlassBottom()
}


fun sandGlassBottom() {
    for (i in 0..5) {
        for (k in 5 downTo i) {
            print(" ")
        }
        for (j in 2 * i downTo 0) {
            print("*")
        }
        println()
    }

}