package org.example.lesson_4

const val TABLES_QUANTITY = 13

fun main() {

    val todayBookedTables = 13
    val yesterdayBookedTables = 9

    println("[Доступность столов на сегодня:${todayBookedTables < TABLES_QUANTITY}]")
    println("[Доступность столов на завтра:${yesterdayBookedTables < TABLES_QUANTITY}]")

}