package oop.app

import oop.data.BigNote
import oop.data.Note

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = "Belajar Kotlin OOP"
    println(note.title)

    val bigNote = BigNote("Belajar OOP")
    println(bigNote.title)
    println(bigNote.bigTitle)
}