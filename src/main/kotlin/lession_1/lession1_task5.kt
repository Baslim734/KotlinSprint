package org.example.lession_1

fun main() {

    // Объявляем переменную с количеством секунд
    val totalSeconds: Short = 6480

    // Переводим секунды в часы, минуты и секунды
    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    println("0$hours:$minutes:0$seconds")

    // Или вариант через форматирование
    val timeFormatted = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println(timeFormatted) // Вывод: 01:48:00

}