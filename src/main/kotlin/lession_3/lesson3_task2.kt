package org.example.lession_3

fun main() {

    var surname = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20

    println("""        Данные по гражданину в возрасте $age лет:
        Фамилия: $surname
        Имя: $firstName
        Отчество: $patronymic
            """.trimIndent())

    age = 20
    surname = "Сидорова"

    println("""        Данные по гражданину в возрасте $age лет:
        Фамилия: $surname
        Имя: $firstName
        Отчество: $patronymic
            """.trimIndent())

}