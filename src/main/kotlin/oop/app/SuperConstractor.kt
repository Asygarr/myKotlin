package oop.app

import oop.data.ExecutiveCustomer
import oop.data.PremiumCustomer

fun main() {

    val premiumCustomer = PremiumCustomer("Asygar")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Asygar", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}