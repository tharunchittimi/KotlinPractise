package com.example.kotlinpractise

fun main(args: Array<String>) {
    val arr = intArrayOf(100, 20, 1, 150, 200, 110)

    println("Array Before Bubble Sort")
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }
    println()

    bubbleSort(arr)//sorting array elements using bubble sort

    println("Array After Bubble Sort")
    for (i in arr.indices) {
        print(arr[i].toString() + " ")
    }

}
fun bubbleSort(arr: IntArray) {
    val n = arr.size
    var temp: Int
    for (i in 0 until n) {
        for (j in 1 until n - i) {
            if (arr[j - 1] > arr[j]) {
                //swap elements
                temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
            }
        }
    }
}


