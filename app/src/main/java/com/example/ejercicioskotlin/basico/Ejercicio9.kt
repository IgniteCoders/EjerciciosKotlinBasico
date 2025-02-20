package com.example.ejercicioskotlin.basico

fun main() {
    println("- Ejercicio 9")

    println("Escriba un numero:")
    val n = readln().toInt()

    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}