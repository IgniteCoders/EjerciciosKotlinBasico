package com.example.ejercicioskotlin.medio

fun main() {
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}

class FoldablePhone(var folded: Boolean = true) : Phone() {

    override fun switchOn() {
        if (!folded) {
            super.switchOn()
        }
    }

    fun fold() {
        folded = true
        switchOff()
    }

    fun unfold() {
        folded = false
    }
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}