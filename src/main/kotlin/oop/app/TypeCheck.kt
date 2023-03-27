package oop.app

import oop.data.HandPhone
import oop.data.Laptop

fun printObjectIf(any: Any) {
    if (any is Laptop) {
        println(any.name)
    } else if (any is HandPhone) {
        println(any.name)
    } else {
        println(any)
    }
}

fun printObjectWhen(any: Any) {
    when(any) {
        is String -> println("String $any")
        is Int -> println("Int $any")
        is Laptop -> println("Laptop ${any.name}")
        is HandPhone -> println("HandPhone ${any.name}")
        else -> println("Unknown")
    }
}

fun printString(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
    print("Masukkan nama : ")
    val nama = readLine()!!.toString()

    print("Masukkan umur : ")
    val umur = readLine()!!.toInt()

    print("Masukkan laptop : ")
    val laptop = readLine()!!.toString()

    print("Masukkan handphone : ")
    val handPhone = readLine()!!.toString()

    println()

    printObjectIf(nama)
    printObjectIf(umur)
    printObjectIf(Laptop(laptop))
    printObjectIf(HandPhone(handPhone))

    println()

    printObjectWhen(nama)
    printObjectWhen(umur)
    printObjectWhen(Laptop(laptop))
    printObjectWhen(HandPhone(handPhone))

    println()
    printString("Asygar")
    printString(100)

}