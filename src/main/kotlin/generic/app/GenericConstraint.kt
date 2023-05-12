package generic.app

interface CanSayHello {
    fun sayHello(nama: String)
}

open class Employee

class Manager: Employee()

class VicePresident: Employee(), CanSayHello {
    override fun sayHello(nama: String) {
        println("Hello $nama, I'm vice president")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main(args: Array<String>) {
    //val data1 = Company(Employee()) // eror
    //val data2 = Company(Manager()) // eror
    val data3 = Company(VicePresident())
}