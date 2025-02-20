package com.example.ejercicioskotlin.basico

fun main() {
    println("- Ejercicio 5")

    println("Escriba un numero:")
    val n = readln().toInt()

    var esPrimo = true

    for (i in 2 until n) {
        if (n % i == 0) {
            esPrimo = false
            break
        }
    }

    if (esPrimo) {
        println("El número $n es primo")
    } else {
        println("El número $n no es primo")
    }
}