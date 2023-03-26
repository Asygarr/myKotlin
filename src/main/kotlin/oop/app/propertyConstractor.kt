package oop.app

import oop.data.User

fun main() {
    val user1 = User("asygar", "zygar")
    val user2 = User("joko", "widodo")

    user1.username = "gar"
    user1.password = "rahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}