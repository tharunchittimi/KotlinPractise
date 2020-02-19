package com.example.kotlinpractise
/*
* program to print RightAngleTriangle
* */
fun main(args: Array<String>) {
    rightAngleStarTriangle(init = 0, rows = 5)
}

fun rightAngleStarTriangle(init : Int, rows : Int) { //here we pass data in arguments
    /*
    * init is initial value and rows represents how many rows to print
    * */
    for (i in init..rows) {  //here 1 to 5
        for (j in init..i) {  //here 1 to i (1,2,3,4,5)
            print("* ")
        }
        println()
    }
}