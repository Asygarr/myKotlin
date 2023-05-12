package generic.data

class MyData<T, U>(val firstData: T, val secondData: U) {

    fun getData() : T = firstData

    fun getDataSecond() : U = secondData

    fun printlnData() {
        println("Data is $firstData and $secondData")
    }
}