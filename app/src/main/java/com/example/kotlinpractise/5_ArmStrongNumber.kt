package com.example.kotlinpractise
fun main(args: Array<String>) {
    armStrongNumber()
}

fun armStrongNumber() {
    var c = 0
    var n = 153
    var a: Int
    var temp: Int
    temp = n
    while (n > 0) {
        a = n % 10
        c += (a * a * a)
        n /= 10
    }
    if (temp==c){
        print("Number is Armstrong")
    }else{
        print("Number is Not Armstrong")
    }
}