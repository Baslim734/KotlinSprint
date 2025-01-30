package org.example.lession_3

fun main() {

    val number = 6

    println("$number * 1 = ${number * 1}")
    println("$number * 2 = ${number * 2}")
    println("$number * 3 = ${number * 3}")
    println("$number * 4 = ${number * 4}")
    println("$number * 5 = ${number * 5}")
    println("$number * 6 = ${number * 6}")
    println("$number * 7 = ${number * 7}")
    println("$number * 8 = ${number * 8}")
    println("$number * 9 = ${number * 9}")

    println((1..9).joinToString("\n") { "$number x $it = ${number * it}" })

}