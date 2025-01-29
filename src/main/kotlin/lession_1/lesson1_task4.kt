package org.example.lession_1

fun main() {

    // Выбираем минимальные типы данных для каждого значения
    val length: Long = 40_868_600_000L          // Long т.к. больше чем Int, и имеет постфикс L
    val age: Byte = 27                          // Byte как малый диапазон, что бы не захламлять память
    val partOfDay: Float = 0.075F               // Float достаточно для 3 знаков после запятой
    val seconds: Short = 6480                   // Short подходящий диапазон
    val partOfYear: Double = 2.0547945205479453E-4 // Double требуется высокая точность после запятой
    val apogee: Int = 327_000                   // Int диапазон до ~2 млрд

    // Вывод всех переменных в столбик
    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)

}