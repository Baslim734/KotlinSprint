package org.example.lesson_2

fun main() {
    // Баллы студентов
    val scoreOne: Float = 3.0F
    val scoreTwo: Float = 4.0F
    val scoreThree: Float = 3.0F
    val scoreFour: Float = 5.0F
    // Вычисление среднего балла
    val averageScore = (scoreOne + scoreTwo + scoreThree + scoreFour) / 4

    // Вывод результата с двумя знаками после запятой
    println("Средний балл по английскому: $averageScore")
}