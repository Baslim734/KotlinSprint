package org.example.lession_3

fun main() {


    val surname = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    val surnameInMarriage = "Сидорова"
    val age = 20
    val marriageAge = 22

    println("""        Данные по гражданину в возрасте $age лет:
        Фамилия: $surname
        Имя: $firstName
        Отчество: $patronymic
            """.trimIndent())

    println("""        Данные по гражданину в возрасте $marriageAge лет:
        Фамилия: $surnameInMarriage
        Имя: $firstName
        Отчество: $patronymic
            """.trimIndent())

}