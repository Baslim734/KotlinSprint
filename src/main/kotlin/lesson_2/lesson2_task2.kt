package org.example.lesson_2

fun main() {

    val numberOfEmployees = 50
    val employeeSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000

    // расходы на выплату зарплаты постоянных сотрудников
    val totalEmployeeSalaryExpenses = numberOfEmployees * employeeSalary

    // общие расходы по зарплате после прихода стажеров
    val totalSalaryExpenses = totalEmployeeSalaryExpenses + (numberOfInterns * internSalary)

    val averageSalary = totalSalaryExpenses / (numberOfEmployees + numberOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeeSalaryExpenses руб.")
    println("Общие расходы по зарплате после прихода стажеров: $totalSalaryExpenses руб.")
    println("Средняя зарплата одного сотрудника после устройства стажеров: $averageSalary руб.")

}