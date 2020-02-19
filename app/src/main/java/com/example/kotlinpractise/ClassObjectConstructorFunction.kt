package com.example.kotlinpractise

open class User {

   private var firstName: String = "Tharun"
    private var age: Int = 24

    /* here we have two types of constructors, primary and secondary
     * In primary constructor, we pass data in class User() like User(s:String)  we mention the value in object creation
     * like user= User(" Tharun ") this is the use.
     * In Secondary Constructor, we create a constructor method, in that we assign data like given below..
     * */

    //here init block is the first to be executed when the class is instantiated

    init {
        println("Class instance is initiated")
    }

    //init block is run every time the class is instantiated

    constructor(s: String) { //* In Secondary Constructor, explained above comments
        println("Name is $s")
        println("Length of Name ${s.length}")
    }

    var loggedIn: Boolean = false //here initial login is false

    fun loggedOn() { //when user login it returns true
        loggedIn = true
    }

    fun loggedOff() { // when user logged out it returns false
        loggedIn = false
    }

    fun printDetails()
    {
        println("Name is $firstName and Age is $age")
    }
}

fun main(args: Array<String>) {
    val user = User("Tharun del Rio")
    println(user.loggedIn) //here prints false b'cze initially it was logged out state

    user.loggedOn()
    println("User Logging in ${user.loggedIn}") //prints true when user login

    user.loggedOff()
    println("User Signing out ${user.loggedIn}") //prints false when user logout

    user.printDetails()
}

