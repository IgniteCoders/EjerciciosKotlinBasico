package com.example.ejercicioskotlin.basico

fun main() {
    println("- Ejercicio 8")

    println("Escriba un texto:")
    val cadena = readln()

    val result = contarVolcales2(cadena)
    println("La cantidad de volcales en el texto \"$cadena\" es $result")
}

fun contarVolcales2(texto: String) : Int {

    val volcales = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    var contador = 0

    for (caracter in texto) {
        if (caracter in volcales) {
            contador ++
        }
    }

    return contador
}

fun contarVolcales(texto: String) : Int {

    /*for (i in 0 until texto.length) {
        val caracter = texto[i]
        println(caracter)
    }*/

    var contador = 0

    for (caracter in texto) {
        when (caracter) {
            'a', 'e', 'i', 'o', 'u' -> contador ++
            'A', 'E', 'I', 'O', 'U' -> contador ++
        }
    }

    return contador
}