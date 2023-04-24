package oop.app

import oop.data.Employee
import oop.data.Manager
import oop.data.VicePresident

fun main() {
    var employee: Employee = Employee("Asygar")
    employee.sayHello("garr")

    employee = Manager("Asygar")
    employee.sayHello("garr")

    employee = VicePresident("Asygar")
    employee.sayHello("garr")
}