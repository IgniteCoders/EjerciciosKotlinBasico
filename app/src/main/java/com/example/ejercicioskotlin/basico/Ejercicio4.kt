package com.example.ejercicioskotlin.basico

fun main() {
    println("- Ejercicio 4")

    println("Escriba un numero:")
    val n = readln().toInt()

    var result = (1 + n) * (n / 2f)

    /*for (i in 1..n) {
        result += i

        if (i == n) {
            println("$i = $result")
        } else {
            print("$i + ")
        }
    }*/

    println("La suma de números de 1 al $n es: $result")
}