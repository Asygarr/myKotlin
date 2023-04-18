package oop.app

import oop.exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Asygar")
        validateAndSayHello("")
    } catch (e: ValidationException) {
        println("Terjadi Error: ${e.message}")
    }
}