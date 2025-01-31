package org.example.lesson_4


fun main() {

    println("Введите наличие повреждений (true/false):")
    val hasDamage = readlnOrNull()?.toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crewSize = readlnOrNull()?.toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val provisions = readlnOrNull()?.toIntOrNull() ?: 0

    println("Введите, благоприятны ли метеоусловия (true/false):")
    val isWeatherFavorable = readlnOrNull()?.toBoolean() ?: false

    val canSetSail = (!hasDamage && crewSize in 55..70 && provisions > 50 && isWeatherFavorable) ||
            (hasDamage && crewSize == 70 && isWeatherFavorable && provisions >= 50)

    if (canSetSail) {
        println("Корабль может отплыть в плавание.")
    } else {
        println("Корабль не может отплыть в плавание.")
    }

}