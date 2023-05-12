package generic.data

class Covariant<out T>(val data: T) {
    fun data() : T {
        return data
    }


}