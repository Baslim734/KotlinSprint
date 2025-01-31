package org.example.lession_1

fun main() {

    val totalSeconds: Short = 6480
    val secondsInMinutes = 60
    val minutesInHour = 60
    val secondsInHour = secondsInMinutes * minutesInHour
    val hours = totalSeconds / secondsInHour
    val remainingSecondsAfterHours = totalSeconds % secondsInHour
    val minutes = remainingSecondsAfterHours / minutesInHour
    val seconds = remainingSecondsAfterHours % secondsInMinutes

    val timeFormatted = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println(timeFormatted)
}