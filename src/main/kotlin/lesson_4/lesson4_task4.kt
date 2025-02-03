package org.example.lesson_4


fun main() {

    val trainingDay = 5
    val isEvenTrainingDay = trainingDay % 2 != 0
    val arms = isEvenTrainingDay
    val legs = !isEvenTrainingDay
    val back = !isEvenTrainingDay
    val abs = isEvenTrainingDay

    val output = """
        Упражнения для рук:       $arms
        Упражнения для ног:       $legs
        Упражнения для пресса:    $abs
        Упражнения для спины:     $back
    """.trimIndent()

    println(output)

}