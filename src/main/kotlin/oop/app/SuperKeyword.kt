package oop.app

import oop.data.Rectangle

fun main() {

    val ractangle = Rectangle()
    println("Corner ${ractangle.corner}")
    println("Parent Corner ${ractangle.parentCorner}")

    ractangle.printName()

}