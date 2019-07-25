package kotlinIn.CaptureSix

import java.lang.IllegalArgumentException

fun foo(s: String?) {
    val t: String = s ?: ""
}

val f = ""

fun main() {
    println(foo(f))

    println(strLenSafe(""))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    printShippingLabel(person)
}

fun strLenSafe(s: String?): Int = s?.length ?: 0


fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw  IllegalArgumentException("No address")
    with(address) {
        println(streetAdress)
        println("$zipCode $city $country")
    }
}

