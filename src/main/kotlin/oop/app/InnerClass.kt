package oop.app

import oop.data.Boss

fun main() {
    val boss = Boss("Asygar")
    val employee = boss.Employee("garr")
    employee.hi()
}