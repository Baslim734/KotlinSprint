package org.example.lession_5

fun main() {

    val currentYear = 2025
    val legalAge = 18

    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()
    val age = currentYear - birthYear

    if (age >= legalAge) {
        println("Show special content")
    } else {
        println("Back to main screen")
    }

}