package org.example.lession_5

fun main() {

    val winningNumber1 = 7
    val winningNumber2 = 21

    println("Введите первое число (от 0 до 42):")
    val userNumber1 = readlnOrNull()?.toInt()
    println("Введите второе число (от 0 до 42):")
    val userNumber2 = readlnOrNull()?.toInt()

    if (userNumber1 != null && userNumber2 != null) {
        val isFirstNumberCorrect = userNumber1 == winningNumber1 || userNumber1 == winningNumber2
        val isSecondNumberCorrect = userNumber2 == winningNumber1 || userNumber2 == winningNumber2

        println("Для победы нужно было угадать числа: $winningNumber1 и $winningNumber2")

        when {
            isFirstNumberCorrect && isSecondNumberCorrect -> println("Поздравляем! Вы выиграли главный приз!")
            isFirstNumberCorrect || isSecondNumberCorrect -> println("Вы выиграли утешительный приз!")
            else -> println("Неудача!")
        }
    } else {
        println("Некорректный ввод. Пожалуйста, введите числа от 0 до 42.")
    }

}