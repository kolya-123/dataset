import kotlin.math.pow
import kotlin.math.abs

fun main() {
    println("Введите значение аргумента:")
    val x = readLine()?.toDouble() ?: 0.0

    println("Введите точность:")
    val epsilon = readLine()?.toDouble() ?: 0.001

    val result = calculateChx(x, epsilon)
    println("Результат: $result")
}

fun calculateChx(x: Double, epsilon: Double): Double {
    var result = 0.0
    var term = 1.0
    var n = 1

    while (abs(term) > epsilon) {
        result += term
        term = (x.pow(n)) / factorial(n)
        n++
    }

    return result
}

fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result *= i
    }
    return result
}