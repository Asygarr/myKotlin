package oop.app

import oop.data.Rectangle
import oop.data.Shape
import oop.data.Triangle

fun main() {

    val shape1 = Shape()
    println(shape1.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)

}