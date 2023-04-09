package oop.app

import oop.data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()


    println(man)
    println(woman)
    println(allGenders.toList())

    println(man.description)
    println(woman.description)
}