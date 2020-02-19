package com.example.kotlinpractise

fun main(args:Array<String>){
    vowelOrConsonents(char = 'p')
}
fun vowelOrConsonents(char:Char){

    val vowelConsonant = if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u')
        "vowel"
    else
        "consonant"
    println("$char is $vowelConsonant")
}