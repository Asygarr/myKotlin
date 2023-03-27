package oop.data

open class Shape {

    open val corner = -1

    open fun printName() {
        println("This is shape")
    }

}

class Rectangle : Shape() {
    override val corner = 4
    val parentCorner = super.corner

    override fun printName() {
        println("This is rectangle")
        super.printName()
    }
}

class Triangle : Shape() {
    override val corner = 3
}