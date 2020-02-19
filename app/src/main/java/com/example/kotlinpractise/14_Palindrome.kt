package com.example.kotlinpractise


fun main(args: Array<String>) {
    palindrome()
}

fun palindrome() {
    var num = 121
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int
    originalInteger = num
    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }
    if (originalInteger == reversedInteger)
        println("$originalInteger is a palindrome.")
    else
        println("$originalInteger is not a palindrome.")

}

//val name: String
//var reverse = " "
//val scanner = Scanner(System.`in`)
//val length: Int
//print("Enter Value to Check Palindrome or Not: ")
//name = scanner.nextLine()
//length = name.length
//for (i in length - 1 downTo 0) {
//    reverse += name[i]
//}
//println("Reverse Value is $reverse")
//
//if (name == reverse)
//println(" the value is palindrome")
//else
//println("the value is not palindrome")