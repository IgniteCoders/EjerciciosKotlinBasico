package com.example.ejercicioskotlin.medio

fun main() {
    val mansour = Person("Mansour", 34, "skateboard", null)
    val amanda = Person("Amanda", 33, "play tennis", mansour)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(
    val name: String,
    val age: Int,
    val hobby: String,
    val referrer: Person?
) {
    fun showProfile() {
        // Fill in code
        println()
        println("Name: $name")
        println("Age: $age")
        print("Likes to $hobby. ")
        if (referrer == null) {
            println("Doesn't have a referrer.")
        } else {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        }
    }
}

//Name: Amanda
//Age: 33
//Likes to play tennis. Doesn't have a referrer.
//
//Name: Atiqah
//Age: 28
//Likes to climb. Has a referrer named Amanda, who likes to play tennis.