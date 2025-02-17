package com.example.ejercicioskotlin

fun main() {
    println("- Ejercicio 1")

    println("Escriba un numero:")
    try {
        val x = readln().toInt()
        val result = x % 2

        if (result == 0) {
            println("El número es par")
        } else {
            println("El número es impar")
        }
    } catch (e: NumberFormatException) {
        println("Solo se admiten numeros enteros")
    }
}