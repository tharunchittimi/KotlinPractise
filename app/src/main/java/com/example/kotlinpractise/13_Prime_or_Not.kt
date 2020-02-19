package com.example.kotlinpractise

import java.util.*

fun main(args: Array<String>) {
    primeOrNot()
}

fun primeOrNot() {
    var temp: Int
    var num: Int
    var isPrime = true
    var scanner = Scanner(System.`in`)
    print("Enter Number to Check Prime Or Not: ")
    num = scanner.nextInt()
    scanner.close()

    for (i in 2 downTo num / 2) {
        temp = num % i
        if (temp == 0) {
            isPrime = false
            break
        }
    }
    if (isPrime)
        print("$num  is Prime Number")
    else
        print("$num  is Not Prime Number")
}