package org.example.lesson_2

fun main() {

    val principal = 70000.0
    val interestRate = 16.7 / 100
    val years = 20

    var futureValue = principal

    // Использовал цикл как самый простой вариант
    for (i in 1..years) {
        futureValue += futureValue * interestRate
    }

    val result = (futureValue * 1000).toInt() / 1000.0
    println("Размер вклада через $years лет: $result")

}