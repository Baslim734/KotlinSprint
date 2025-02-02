package org.example.lession_3

fun main() {

    val serverResponse = "D2-D4;0"

    val cleanData = serverResponse
        .split(";")

    val (parsedFrom, parsedTo) = cleanData[0].split("-")

    val parsedNumber = cleanData[1]

    println("\nРезультат парсинга:")
    println("Откуда: $parsedFrom")
    println("Куда: $parsedTo")
    println("Номер хода: $parsedNumber")

}