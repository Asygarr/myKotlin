package oop.app

import oop.data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("Ini sample action")
    }
}

fun main() {
    fireAction(SampleAction())
    fireAction(object : Action {
        override fun action() {
            println("Action One")
        }
    })
    fireAction(object : Action {
        override fun action() = println("Action Two")
    })
}