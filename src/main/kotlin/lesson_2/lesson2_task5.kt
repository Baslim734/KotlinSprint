package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val principal = 70000.0
    val interestRate = 16.7
    val percentageDivider = 100
    val years = 20
    val numberForRounding = 1000.0
    val initialInvestmentAmount = 1

    val hardPercentageFormula = initialInvestmentAmount + (interestRate / percentageDivider.toDouble())
    val futureValue = principal * hardPercentageFormula.pow(years)

    val result = (futureValue * numberForRounding).toInt() / numberForRounding
    println("Размер вклада через $years лет: $result")

}