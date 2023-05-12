package generic.app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringReadWriteProperty(var data: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property ${property.name} from $data to $value")
        data = value
    }
}

class Person(param: String) {
    var name: String by StringReadWriteProperty(param)
}

fun main() {
    var person = Person("Asygar")
    println(person.name)

    person = Person("garr")
    println(person.name)
}