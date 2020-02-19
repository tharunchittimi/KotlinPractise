package com.example.kotlinpractise

fun main(a: Array<String>) {
    val arr1 = intArrayOf(10, 9, 11, 5, 3, 16, 1, 20)
    println("Before Insertion Sort")
    for (i in arr1) {
        print("$i ")
    }
    println()

    insertionSort(arr1)//sorting array using insertion sort

    println("After Insertion Sort")
    for (i in arr1) {
        print("$i ")
    }
}

fun insertionSort(array: IntArray) {
    val n = array.size
    for (j in 1 until n) {
        val key = array[j]
        var i = j - 1
        while (i > -1 && array[i] > key) {
            array[i + 1] = array[i]
            i--
        }
        array[i + 1] = key
    }
}

