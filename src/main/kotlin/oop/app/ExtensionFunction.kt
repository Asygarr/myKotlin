package oop.app

import oop.data.Student
import oop.data.sayHello
import oop.data.upperName

fun main() {
    val student = Student("Asygar", 19)
    student.sayHello("gar")
    println(student.upperName)
}