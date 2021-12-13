package com.example.andrclassworks
import java.util.Scanner
fun main() {
    val map = hashMapOf(
        "JK" to 995290502,
        "Nadia" to 995120500,
        "Ayima" to 995050920,
        "Timka" to 555789124,
        "Alish" to 900000009
    )
    println("number of records:")
    val records = readLine().parseToInt()
    val iterator = (1..records).iterator()
    val read = Scanner(System.`in`)
    iterator.forEach {
        println("Enter name and number: ")
        val name = read.next()
        val phone = read.nextInt()
        map[name] = phone
    }
    do {
        println(
            "Enter your name: " +
                    "\n type 'x' to exit"
        )
        val key = readLine()
        if (key in map.keys) {
            println("$key = ${map.get(key)}")
        } else {
            println("Error!")
        }
    } while (key != "x")
    read.close()
}

private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0
    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception= $e")
        return 0
    }
}
