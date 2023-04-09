package oop.app

import oop.data.Minus
import oop.data.Modulo
import oop.data.Operation
import oop.data.Plus

fun operation(value1: Int, value2: Int, operation: Operation) : Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 / value2
    }
}

fun main() {
    println(operation(10, 20, Plus()))
    println(operation(12, 98, Minus()))
    println(operation(28, 2, Modulo()))
}