package com.example.kotlinpractise

fun main(args: Array<String>) {
    duplicateCharecters()
}

fun duplicateCharecters() {
    var str = "Internall"
    var count = 0
    var char = str.toCharArray()
    print("Duplicate Charecters are : ")
    for (i in str.indices) {
        for (j in i + 1 until str.length) {
            if (char[i] == char[j]) {
                print(char[j])
                count++
                break
            }
        }
    }
}