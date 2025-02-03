package org.example.lesson_4


fun main() {

    println("Введите наличие повреждений (true/false):")
    val isDamaged = readlnOrNull()?.toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crewSize = readlnOrNull()?.toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val provisionsNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Введите, благоприятны ли метеоусловия (true/false):")
    val isWeatherFavorable = readlnOrNull()?.toBoolean() ?: false

    val canSetSail = (!isDamaged && crewSize in 55..70 && provisionsNumber > 50 && isWeatherFavorable) ||
            (isDamaged && crewSize == 70 && isWeatherFavorable && provisionsNumber >= 50)

    if (canSetSail) {
        println("Корабль может отплыть в плавание.")
    } else {
        println("Корабль не может отплыть в плавание.")
    }

}