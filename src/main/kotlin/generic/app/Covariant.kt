package generic.app

import generic.data.Covariant

fun main(args: Array<String>) {
    val covariantString = Covariant("Asygar")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())
}