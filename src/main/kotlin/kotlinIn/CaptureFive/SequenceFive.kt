package kotlinIn.CaptureFive

fun main() {
    val people = listOf(Person("Alice", 21), Person("Bob", 44))

    people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()
}