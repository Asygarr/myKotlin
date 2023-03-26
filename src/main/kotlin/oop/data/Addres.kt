package oop.data

class Addres {

    var streat = ""
    var city = ""
    var country = "Indonesia"

    constructor(paramStreat: String, paramCity: String) {
        streat = paramStreat
        city = paramStreat
    }

    constructor(paramStreat: String, paramCity: String, paramCountry: String) :
            this(paramStreat, paramCity) {
        country = paramCountry
    }

}