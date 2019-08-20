package kotlinIn.CaptureTen

import ru.yole.jkid.JsonExclude
import ru.yole.jkid.JsonName
import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.serialization.serialize
import kotlin.reflect.full.memberProperties

data class Person(val name: String, val age: Int)

data class Human(@JsonName("alias") val firstName: String,
                 @JsonExclude val age: Int? = null)

fun main() {
    val person = Person("Alice", 25)
    println(serialize(person))

    val json = """{"name": "Alice", "age": 26}"""
    println(deserialize<Person>(json))

    val alice = Human("Alice", 20)
    println(serialize(alice))

    val jsonAlice = """{"alias": "Alice"}"""
    println(deserialize<Human>(jsonAlice))

    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    println(kClass.qualifiedName)
    println(kClass.members)
    println(kClass.constructors)
    println(kClass.nestedClasses)

    kClass.memberProperties.forEach { println(it.name) }

}