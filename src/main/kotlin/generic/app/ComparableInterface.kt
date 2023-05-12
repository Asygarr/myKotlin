package generic.app

class Fruit(val nama: String, val quantity: Int) : Comparable<Fruit>{
    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    val fruit1 = Fruit("Apple", 10)
    val fruit2 = Fruit("Mangga", 20)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}