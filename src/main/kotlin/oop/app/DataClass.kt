package oop.app

import oop.data.Products

fun main() {
    val product = Products("Indomie", 2500, "Mie Goreng")
    val productCopy = product.copy(name = "Mie Sedap")

    println(product)
    println(productCopy)
}