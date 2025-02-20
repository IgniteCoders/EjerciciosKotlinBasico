package com.example.ejercicioskotlin.medio

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    /*if (age in 1..12) {
        return 15
    } else if (age in 13..60) {
        return 30
    } else if (age in 61..100) {
        return 20
    } else {
        return -1
    }*/

    return when (age) {
        in 1..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

//The movie ticket price for a person aged 5 is $15.
//The movie ticket price for a person aged 28 is $25.
//The movie ticket price for a person aged 87 is $20.