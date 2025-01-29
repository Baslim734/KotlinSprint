package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    // переводим время выезда в минуты
    val totalDepartureTimeInMinutes = departureHour * 60 + departureMinute

    // вычисляем общее время прибытия в минутах
    val totalArrivalTimeInMinutes = totalDepartureTimeInMinutes + travelTimeMinutes

    // переводим общее время прибытия обратно в часы и минуты
    val arrivalHour = (totalArrivalTimeInMinutes / 60) % 24
    val arrivalMinute = totalArrivalTimeInMinutes % 60

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")

}