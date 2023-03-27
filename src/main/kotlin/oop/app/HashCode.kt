package oop.app

import oop.data.Company

fun main() {
    val company1 = Company("Asygar")
    val company2 = Company("Asygar")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}