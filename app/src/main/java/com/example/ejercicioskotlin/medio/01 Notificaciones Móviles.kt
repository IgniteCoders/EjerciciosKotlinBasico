package com.example.ejercicioskotlin.medio

fun main() {
    val morningNotification = 519
    val eveningNotification = 13

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

// You have 51 notifications.
// Your phone is blowing up! You have 99+ notifications.