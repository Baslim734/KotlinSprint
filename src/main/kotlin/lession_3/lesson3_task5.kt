package org.example.lession_3

fun main() {

    val serverResponse = "D2-D4;0"

    val (parsedFrom, parsedTo,parsedNumber) = serverResponse
        .split(";","-")

    println("\nРезультат парсинга:")
    println("Откуда: $parsedFrom")
    println("Куда: $parsedTo")
    println("Номер хода: $parsedNumber")

}