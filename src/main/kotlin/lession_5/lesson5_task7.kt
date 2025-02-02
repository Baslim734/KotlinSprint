package org.example.lession_5

fun main() {

    val standardizedDistance = 100

    print("Введите расстояние поездки (в километрах): ")
    val distance = readlnOrNull()?.toFloat()

    print("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumptionPer100Km = readlnOrNull()?.toFloat()

    print("Введите текущую цену за литр топлива: ")
    val pricePerLiter = readlnOrNull()?.toFloat()

    if (distance == null || fuelConsumptionPer100Km == null || pricePerLiter == null) {
        println("Ошибка: введены некорректные данные.")
        return
    }

    val totalFuel = distance / standardizedDistance * fuelConsumptionPer100Km

    val totalCost = totalFuel * pricePerLiter

    println("Необходимое количество топлива: %.2f литров".format(totalFuel))
    println("Итоговая стоимость поездки: %.2f рублей".format(totalCost))

}