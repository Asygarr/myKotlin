package oop.app

import oop.data.Fruit

fun main() {
    val fruit1 = Fruit(110)
    val fruit2 = Fruit(102)
    val fruit3 = fruit1 + fruit2

    println(fruit3 - Fruit(27))
    println(fruit3)
}