package oop.data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    // Ininitializer Block
    init {
        println("""
            Class Car dibuat
            brand : $paramBrand
            year : $paramYear
        """.trimIndent())
    }

    // Secondary Constractor
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2021) {
        println("Secondary Constractor 1")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constractor 2")
    }

    var brand = paramBrand
    var name = paramName
    var year = paramYear

}