package com.example.ejercicioskotlin.basico

fun main() {
    println("- Ejercicio 10")

    println("Escriba tres numeros:")
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()

    val result = numeroMayor(x, y, z)
    println("El numero mayor es: $result")
}

fun numeroMayor(a: Int, b: Int, c: Int): Int {

    var mayor = a
    if (b > mayor) {
        mayor = b
    }
    if (c > mayor) {
        mayor = c
    }

    if (a == b && a == c) {
        println("Son iguales")
    }

    return mayor
}