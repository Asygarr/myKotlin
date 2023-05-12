package generic.app

import generic.data.Function

fun main() {
    val function = Function("Asygar")

    function.sayHello('A')
    function.sayHello("garr")
    function.sayHello(100)
}