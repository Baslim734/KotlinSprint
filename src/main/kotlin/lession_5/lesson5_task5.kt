package org.example.lession_5
import kotlin.random.Random

fun main() {

    val winningNumbers = List(3) { Random.nextInt(0, 43) }
    val userNumbers = mutableListOf<Int>()

    println("Добро пожаловать в лотерею! Угадайте три числа от 0 до 42.")
    repeat(3) { index ->
        println("Введите число №${index + 1}:")
        val number = readlnOrNull()?.toInt()
        if (number != null) {
            userNumbers.add(number)
        } else {
            println("Некорректный ввод. Пожалуйста, введите число от 0 до 42.")
            return
        }
    }

    val matchedNumbers = winningNumbers.intersect(userNumbers.toSet()).toList()
    val matchCount = matchedNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: ${winningNumbers.sorted()}")

}