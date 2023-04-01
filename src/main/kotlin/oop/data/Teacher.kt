package oop.data

class Teacher(val name: String) {
    private fun Teach() {
        println("Teach name : $name")
    }

    fun teachName() {
        this.Teach()
    }
}