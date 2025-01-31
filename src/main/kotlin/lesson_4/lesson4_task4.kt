package org.example.lesson_4


fun main() {

    val trainingDay = 5
    val armsAndAbs = trainingDay % 2 != 0
    val legsAndBack = !armsAndAbs

    val output = """
        Упражнения для рук:       $armsAndAbs
        Упражнения для пресса:    $armsAndAbs
        Упражнения для ног:       $legsAndBack
        Упражнения для спины:     $legsAndBack
    """.trimIndent()

    println(output)

}