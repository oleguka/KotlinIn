package kotlinIn.CaptureFive

data class Person(val name: String, val age: Int)
fun Person.isAdult() = age >= 21

