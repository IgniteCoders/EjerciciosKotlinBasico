package com.example.ejercicioskotlin.medio

fun main () {
    val song1 = Song("Beat it", "Michael Jackson", 1984, 875)
    val song2 = Song("I want to break free", "Queen", 1987, 1405)

    song1.printDescription()
    song1.printIsPopular()
    song1.playCount = 1906
    song1.printIsPopular()


    song2.printDescription()
    song2.printIsPopular()
}

class Song (
    val title: String,
    val artist: String,
    val year: Int,
    var playCount: Int
) {

    val isPopular: Boolean
        get() = playCount >= 1000

    fun printIsPopular() {
        if (isPopular) {
            println("Esta canción es popular")
        } else {
            println("Esta canción no es popular")
        }
    }

    fun printDescription() {
        println("$title, interpretada por $artist, se lanzó en $year")
    }
}