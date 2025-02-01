package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val bonusPercentage =  20
    val percentageDivider = 100

    val bonusCrystalOre = crystalOre * bonusPercentage / percentageDivider
    val bonusIronOre = ironOre * bonusPercentage / percentageDivider

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")

}