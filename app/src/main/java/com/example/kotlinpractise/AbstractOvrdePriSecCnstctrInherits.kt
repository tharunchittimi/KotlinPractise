package com.example.kotlinpractise
//abstract class defines that class has abstract methods and non-abstract methods
abstract class Person {
    init {
        //here init block is the first to be executed when the class is instantiated
    }

    constructor(userName: String) {
        println("Through secondary constructor we printing. Person Name $userName")
    }
    abstract fun displayAge() //it is abstract method, it can be overridden in another class when this class is extends to another class
}

class Teacher(password: String) : Person(userName = "Daniel Tharun") {
    /* here we extends the person abstract class to teacher class
       here person(userName) is act as super */
    init {
    println("Password Captured $password")
    }
    private var age: Int = 22 /* uses of private is to protect the data from hackers,
                                if we provide private to any class or variable that should be accessed within that class only*/

    override fun displayAge() {
        println("Non-abstract class displayAge fun is overridden.  Age is $age")
    }
}

fun main() {
    val person = Teacher("xxxxxxx")
    person.displayAge()
}