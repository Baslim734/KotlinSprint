package org.example.lession_3

fun main() {

    var stepFrom = "E2"
    var stepWhere = "E4"
    var numberStep = 1

    println("[$stepFrom-$stepWhere;$numberStep]")

    stepFrom = "D2"
    stepWhere = "D3"
    numberStep ++

    println("[$stepFrom-$stepWhere;$numberStep]")

    stepFrom = "D2"
    stepWhere = "D4"
    numberStep = 0

    val serverResponse = "[$stepFrom-$stepWhere;$numberStep]"

    val cleanData = serverResponse
        .removeSurrounding("[", "]")
        .split(";")

    val (parsedFrom, parsedTo) = cleanData[0].split("-")

    val parsedNumber = cleanData[1]

    println("\nРезультат парсинга:")
    println("Откуда: $parsedFrom")
    println("Куда: $parsedTo")
    println("Номер хода: $parsedNumber")

}