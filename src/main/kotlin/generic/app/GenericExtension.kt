package generic.app

class Data<T>(val data: T)

fun Data<String>.print() {
    val data: String = this.data
    println(data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("garr")

    // data1.print() // Error kerena integer
    data2.print()
}