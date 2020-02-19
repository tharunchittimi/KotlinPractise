package com.example.kotlinpractise

import com.google.gson.Gson

/*kotlin welcome class*/

fun main(args: Array<String>) {

    println("Hi Tharun Welcome to Kotlin")
    println(1)
    println(9 - 10)
    println(10 / 10)
    println(20 % 3)

    /*printing a name using keyword val*/
    val name = "Tharun"
    println(name)

    /*printing a value using keyword var*/
    var r = 20
    println(r)

    /*printing an array of values, here arrayOf is the object*/
    val arr = arrayOf(1, "tharun", 10.9f, 123)
    println(arr.get(1))
    println(arr[3])
    val gSon:String= Gson().toJson(arr)
    println(gSon)

    /*here printing a name using var, it is mutable so we change the value after declare */
    var personName = "Tharun"
    personName = "Del rio"
    println(personName)

    /*here val is immutable so we can't change the value*/
    val immutableName = "Im here"
    // immutableName="im there"
    println(immutableName)

    /*here we print String method*/
    var checkString = "tharun"
    println(checkString.length)
    println(checkString.plus("Rio"))
    println(checkString[2])
    println(checkString.contains("T", true))
    println(checkString.compareTo("THA", true))

    /*type conversion, here we have to mention what type of typeCasting to be done, like below.*/
    val num: Int = 101
    //    val num1: Long= num
    val num1: Long = num.toLong()
    /*here it is upCasting*/
    println(num1)

    val no: Long = 98876789098767898
    val no2: Int = no.toInt()
    /*here it is downCasting, In kotlin DownCasting is restricted*/
    println(no2)

    /*here is arithmetic operations*/
    var firstValue = 10
    var secondValue = 20
    println("First Value is $firstValue Second Value is $secondValue Total ${firstValue + secondValue}")
    println("First Value is $firstValue Second Value is $secondValue Total ${firstValue - secondValue}")
    println("First Value is $firstValue Second Value is $secondValue Total ${firstValue % secondValue}")
    println("First Value is $firstValue Second Value is $secondValue Total ${firstValue / secondValue}")
    println("First Value is $firstValue Second Value is $secondValue Total ${firstValue * secondValue}")

    /*here enter a username by user through input method*/
    println("enter an userName: ")
    val userInput = readLine()
    println("you have entered this: $userInput")

    println("enter an userPassword: ")
    val userPassword = readLine()
    println("you have entered this: $userPassword")

}