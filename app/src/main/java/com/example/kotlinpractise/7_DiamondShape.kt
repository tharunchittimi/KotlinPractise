package com.example.kotlinpractise

fun  main(){
    diamndStarPattern(3)
}
fun diamndStarPattern(n:Int){
    for (i in 1 .. n){
        for (j in n-i downTo 1){
            print(" ")}
        for (j in 1 .. i){
            print("* ")
        }
        println()
    }

    for (l in n downTo 0)
    {
        for (m in 0 .. n-l){
            print(" ")
        }
        for (m in l downTo 2){
            print("* ")
        }
        println()
    }
}