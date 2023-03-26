package oop.app

import oop.data.Manager
import oop.data.VicePresident

fun main() {

    val manager = Manager("Asygar")
    manager.sayHello("Joko")

    val vp = VicePresident("gar")
    vp.sayHello("Joko")
}