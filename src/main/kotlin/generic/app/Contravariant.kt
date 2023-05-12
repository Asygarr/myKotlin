package generic.app

class Contravariant<in T> {
    fun sayHello(param: T) {
        print("Hellp $param")
    }
}

fun main(args: Array<String>) {
    val contravariant = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariant


    contravariantString.sayHello("Garr")
}