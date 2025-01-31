package org.example.lesson_2

fun main() {

    val principal = 70000.0
    val interestRate = 16.7 / 100
    val years = 20
    val numberForRounding = 1000.0

    var futureValue = principal

    for (i in 1..years) {
        futureValue += futureValue * interestRate
    }

    val result = (futureValue * numberForRounding).toInt() / numberForRounding
    println("Размер вклада через $years лет: $result")

}