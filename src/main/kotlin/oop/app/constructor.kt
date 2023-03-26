package oop.app

import oop.data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2015

    val almaz = Car("Wulling","Almaz")
    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}