package org.example.lesson_4

const val  WEIGHT_MIN = 35
const val  WEIGHT_MAX = 100
const val  VOLUME_MAX = 100

fun main() {

    val weightFirstLoad = 20
    val volumeFirstLoad = 80
    val weightSecondLoad = 50
    val volumeSecondLoad = 100

    println("Груз с весом $weightFirstLoad кг и объемом $volumeFirstLoad л соответствует категории 'Average': " +
            (weightFirstLoad > WEIGHT_MIN && weightFirstLoad <= WEIGHT_MAX && volumeFirstLoad < VOLUME_MAX))

    println("Груз с весом $weightSecondLoad кг и объемом $volumeSecondLoad л соответствует категории 'Average': " +
            (weightSecondLoad > WEIGHT_MIN && weightSecondLoad <= WEIGHT_MAX && volumeSecondLoad < VOLUME_MAX))

}