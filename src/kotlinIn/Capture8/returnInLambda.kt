package kotlinIn.Capture8

data class Person1(val name: String, val age: Int)

val people = listOf(Person1("Alice", 29), Person1("Bob", 31))

fun lookForAlice(people: List<Person1>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun lookForAlice1(people: List<Person1>) {
    people.forEach label@{
        if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

fun main() {
    lookForAlice(people)
    lookForAlice1(people)
}