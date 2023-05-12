package generic.app

import generic.data.MyData

fun main() {
    val myData1: MyData<String, Int> = MyData("Asygar", 19)
    myData1.printlnData()

    val myData2: MyData<Int, Char> = MyData(10, 'A')
    println("${myData2.getData()} and ${myData2.getDataSecond()}")

}