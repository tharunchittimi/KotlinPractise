package com.example.kotlinpractise

fun main(args: Array<String>) {
    val arr = intArrayOf(10, 20, 30, 40, 50)
    val key = 30
    val last = arr.size - 1
    val result = binarySearch(arr, 0, last, key)
    if (result == -1)
        println("Element is not found!")
    else
        println("Element is found at index: $result")
}

fun binarySearch(arr: IntArray, first: Int, last: Int, key: Int): Int {
    if (last >= first) {
        val mid = first + (last - first) / 2
        if (arr[mid] == key) {
            return mid
        }
        return if (arr[mid] > key) {
            binarySearch(arr, first, mid - 1, key)//search in left subarray
        } else {
            binarySearch(arr, mid + 1, last, key)//search in right subarray
        }
    }
    return -1
}

