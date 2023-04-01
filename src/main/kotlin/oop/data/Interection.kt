package oop.data

interface Interection {
    val name: String
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go : Interection {
    fun go() {
        println("Go!")
    }
}

class Human(override val name: String) : Interection, Go