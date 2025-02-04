package org.example.lesson_4

const val CREW_SIZE_MINIMAL = 55
const val CREW_SIZE_MAXIMUM = 70
const val REQUIRED_MINIMAL_PROVISION = 50

fun main() {

    println("Введите наличие повреждений (true/false):")
    val isDamaged = readlnOrNull()?.toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crewSize = readlnOrNull()?.toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val provisionsNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Введите, благоприятны ли метеоусловия (true/false):")
    val isWeatherFavorable = readlnOrNull()?.toBoolean() ?: false

    val canSetSail = (!isDamaged && crewSize in CREW_SIZE_MINIMAL..CREW_SIZE_MAXIMUM &&
            provisionsNumber > REQUIRED_MINIMAL_PROVISION && isWeatherFavorable) ||
            (isDamaged && crewSize == CREW_SIZE_MAXIMUM && isWeatherFavorable && provisionsNumber >= REQUIRED_MINIMAL_PROVISION)

    if (canSetSail) {
        println("Корабль может отплыть в плавание.")
    } else {
        println("Корабль не может отплыть в плавание.")
    }

}