package com.example.kotlinpractise
/*
* Program Prints Triangle
* */
fun main(args: Array<String>) {
//    triangle(rows = 5)
    alphabet()
}

fun triangle(rows: Int) {

    for (i in 0..rows) {  //define rows
        for (k in rows-i downTo 1) {  //define Spaces
            print(" ")
        }
        for (j in 0 ..  i) {
            print("* ")
        }
        println()
    }
}

fun alphabet(){

    val n= 5
    for (i in 0..n){
        for (j in 0..n/2){
            if ((j==0 || j== n/2)&& i !=0 || i==0 && j != n/2 || i==n/2){
                print("*")
            }
            print(" ")
        }
        println()
    }
}