package org.example.lesson_4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val NEEDED_HUMIDITY = 20
const val NOT_WINTER = "зима"

fun main() {

    val isSunnyWeather = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val checkingConditions =
            isSunnyWeather == IS_SUNNY &&
            isTentOpen == IS_TENT_OPEN &&
            humidity >= NEEDED_HUMIDITY &&
            currentSeason != NOT_WINTER

    println("Благоприятные ли условия сейчас для роста бобовых? $checkingConditions")

}