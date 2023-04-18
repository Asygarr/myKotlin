package oop.app

import oop.data.Game
import oop.data.Login
import oop.data.MinMax

fun main() {
    val game = Game("Game Kotlin", 10000)
//    val name = game.name

    val (name, price) = game
    println(
        """
        Name: $name
        Price: $price
    """.trimIndent()
    )

    val (min, max) = minMax(10, 100)
    println(
        """
        Min: $min
        Max: $max
    """.trimIndent()
    )

    val masuk = Login("admin", "admin")
    login(masuk) {
        (username, password) -> username == "admin" && password == "admin"
    }
}

fun minMax(value1: Int, value2: Int): MinMax {
    return if (value1 > value2) {
        MinMax(value2, value2)
    } else {
        MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean) : Boolean {
    return callback(login)
}