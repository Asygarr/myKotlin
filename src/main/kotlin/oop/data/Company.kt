package oop.data

class Company(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Company -> other.name == name
            else -> false
        }
    }

}