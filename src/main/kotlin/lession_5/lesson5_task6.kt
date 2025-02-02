package org.example.lession_5

fun main() {

    val bmiLow = 18.5
    val bmiAverage = 25
    val bmiRedundant = 30
    val centimetersInMeters = 100
    print("Введите ваш вес в килограммах: ")
    val weight = readlnOrNull()?.toDouble()

    print("Введите ваш рост в сантиметрах: ")
    val heightCm = readlnOrNull()?.toDouble()

    if (weight == null || heightCm == null) {
        println("Ошибка: введены некорректные данные.")
        return
    }

    val heightM = heightCm / centimetersInMeters
    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < bmiLow -> "Недостаточная масса тела"
        bmi < bmiAverage -> "Нормальная масса тела"
        bmi < bmiRedundant -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория веса: $category")

}