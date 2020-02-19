package com.example.kotlinpractise

fun main(args:Array<String>){
    alphabets()
}
fun alphabets(){
    var c: Char = 'A'
    while (c <= 'Z') {
        print("$c ")
        ++c
    }
}