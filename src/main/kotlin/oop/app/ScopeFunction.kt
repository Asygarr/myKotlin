package oop.app

import oop.data.Student

fun main() {
    val student = Student("Asygar", 19)
    println(student.name)
    println(student.age)

    val result: String = student.let {
//        println(it.name)
//        println(it.age)

        "Name ${it.name} and age ${it.age}"
    }
    println(result)

    val result2: String = student.run {
        "Name ${this.name} and age ${this.age}"
    }
    println(result2)

    val result3: Student = student.apply {
        "Name ${this.name} and age ${this.age}"
    }
    println(result3)

    val result4: Student = student.also {
        "Name ${it.name} and age ${it.age}"
    }
    println(result4)

    val result5: String = with(student) {
        "Name ${this.name} and age ${this.age}"
    }
    println(result5)

}