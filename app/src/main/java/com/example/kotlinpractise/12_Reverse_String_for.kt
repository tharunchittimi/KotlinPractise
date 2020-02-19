package com.example.kotlinpractise

fun main(args: Array<String>) {
    reverseStringWithoutReverseM(name = "tharun del rio")
}

fun reverseStringWithoutReverseM(name:String) {
    var list: List<String> = name.split("".toRegex())
    for (i in name.length downTo 0)
        print(list[i])
}