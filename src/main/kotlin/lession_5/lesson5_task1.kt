package org.example.lession_5

fun main() {

    val firstNumber = 4
    val secondNumber = 2
    val correctAnswer = firstNumber + secondNumber

    println("Пожалуйста, решите пример: $firstNumber + $secondNumber = ?")
    val userAnswer = readlnOrNull()?.toIntOrNull()

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}
