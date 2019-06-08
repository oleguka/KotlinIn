package kotlinIn.CaptureSix

fun strLen(s: String?): Int {
    if (s != null) return s.length else return 0
}

fun main() {
    println(strLen(""))

    val nol = Pers("Oleg", null)
    val tor = Pers("Tor", nol)
    nol.click(null)

    println(managerName(nol))
    println(managerName(tor))

    val person = Person("Ira", null)
    println(person.countryName())
}


fun managerName(employee: Pers): String? = employee.manager?.name

class Pers(val name: String, val manager: Pers?) {



    fun click(s: String?) = println(s?.toUpperCase())
}

class Address(val streetAdress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person (val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}