package oop.data

class Person {

    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String){
        println("Hello $name, my Name is $firstName")
    }

    fun sayHello(firstName: String, lastName: String){
        println("Hello $firstName $lastName, my Name is ${this.firstName}")
    }

    fun run() {
        println("i am run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }

}