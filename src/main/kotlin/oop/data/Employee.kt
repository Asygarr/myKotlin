package oop.data

open class Employee(val name: String) {

    open fun sayHello(name: String) {
        println("Hello $name, my Name is ${this.name}")
    }

}

open class Manager(name: String) : Employee(name) {

    final override fun sayHello(name: String) {
        println("Hello $name, my Job is Manager and my name is ${this.name}")
    }

}

class SuperManager(name: String) : Manager(name) {
    // Error karena final pada override (OPEN)
//    override fun sayHello(name: String) {
//        println("Hello $name, my Job is Super Manager and my name is ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {

    override fun sayHello(name: String) {
        println("Hello $name, my Job is Vice President and my name is ${this.name}")
    }

}