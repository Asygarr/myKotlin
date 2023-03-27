package oop.data

class User (var username: String, var password: String) {

    override fun toString(): String {
        return "User(username='$username', password='$password')"
    }

}