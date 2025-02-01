package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457
    val minutesInHour = 60
    val hoursInDay = 24
    val secondsInMinute = 60

    val totalDepartureTimeInMinutes = departureHour * minutesInHour + departureMinute

    val totalArrivalTimeInMinutes = totalDepartureTimeInMinutes + travelTimeMinutes

    val arrivalHour = (totalArrivalTimeInMinutes / secondsInMinute) % hoursInDay
    val arrivalMinute = totalArrivalTimeInMinutes % secondsInMinute

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")

}