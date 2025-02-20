package com.example.ejercicioskotlin.basico

fun main() {
    println("- Ejercicio 7")

    println("Escriba un numero:")
    val n = readln().toInt()

    val result = factorial(n)

    println("El factorial del número $n es: $result")
}

fun factorial(n: Int): Int {
    if (n == 1) {
        return 1
    } else {
        return n * factorial(n-1)
    }
}

fun factorialOld(n: Int): Int {
    var result = 1

    for (i in 1..n) {
        result *= i

        if (i == n) {
            println("$i = $result")
        } else {
            print("$i x ")
        }
    }

    return result
}