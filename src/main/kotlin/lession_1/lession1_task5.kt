package org.example.lession_1

fun main() {

    val totalSeconds: Short = 6480

    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    println("0$hours:$minutes:0$seconds")

    val timeFormatted = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println(timeFormatted)
}