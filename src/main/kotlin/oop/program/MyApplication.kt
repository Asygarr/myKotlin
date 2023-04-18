package oop.program

import oop.annotations.Fancy

@Fancy(author = "Asygar")
class MyApplication(val name: String, val version: Int) {

    fun info(): String {
        return "$name : $version"
    }

}