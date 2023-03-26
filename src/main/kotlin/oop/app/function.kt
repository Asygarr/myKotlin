package oop.app

import oop.data.Person

fun main() {

    val gar = Person()

    gar.firstName = "Muhammad"
    gar.middleName = "Asygar"
    gar.lastName = "Faeruddin"

    gar.sayHello("Dongo")
    gar.run()
    println(gar.getFullName())

}