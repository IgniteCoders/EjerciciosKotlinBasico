package com.example.ejercicioskotlin.medio

fun main() {
    // Fill in the code.
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { measurement ->
        measurement * 9 / 5 + 32
    }

    printFinalTemperature(350.0, "Kelvin", "Celsius") { measurement ->
        measurement - 273.15
    }

    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { measurement ->
        (measurement - 32) * 5 / 9 + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasure = conversionFormula(initialMeasurement)

    val finalMeasurement = String.format("%.2f", finalMeasure) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

//27.0 degrees Celsius is 80.60 degrees Fahrenheit.
//350.0 degrees Kelvin is 76.85 degrees Celsius.
//10.0 degrees Fahrenheit is 260.93 degrees Kelvin.