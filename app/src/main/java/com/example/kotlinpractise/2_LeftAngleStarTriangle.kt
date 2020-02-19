package com.example.kotlinpractise
/*
* program to print LeftAngleTriangle
* */
fun main(args: Array<String>) {
    leftAngleStarTriangle( rows = 4)
}

fun leftAngleStarTriangle( rows:Int){  //here we pass data in arguments

    for (i in 0..rows){
        for (k in 2*(rows-i) downTo  0 ){ //here downTo is minus
            print(" ")
        }
        for (j in 0 .. i){ //here until is between 1 to i(1,2,3,4,5) + 1
            print("* ")
        }
        println()

    }
}