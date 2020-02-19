package com.example.kotlinpractise

fun main(args: Array<String>) {
    programCountWordsInString()
}

fun programCountWordsInString() {

    val str = "Here I Am With You"
    val split = str.split(" ")
    val map: HashMap<String, Int> = HashMap()
    for (i in split.indices - 1) {
        if (map.containsKey(split[i])) {
            val count = map[split[i]]
            map[split[i]] = count!!.plus(1)
        } else {
            map[split[i]] = 1
        }
    }
    print(map)
}