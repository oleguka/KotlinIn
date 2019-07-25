package kotlinIn.CaptureFive

fun main() {
    val people = listOf(Person("Alice", 21), Person("Bob", 44))
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))

    people.maxBy{ p: Person -> p.age }

    val sum = {x: Int, y: Int -> x + y}
    println(sum(1, 2))
    run { println(42) }


    val names = people.joinToString(separator = " ", transform = {p: Person -> p.name})
    println(names)

    people.joinToString(" ") { p:Person -> p.name}
    people.joinToString(" ") { p -> p.name}
    people.joinToString(" ") { it.name}

    val getAge = Person::age

    fun salute() = println("Salute!")
    run(::salute)

    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person::isAdult

    val r = Person("Oleg", 34)
    val personAgeFunction = Person::age
    println(personAgeFunction(r))

    val olegAgeFunction = r::age
    println(olegAgeFunction())
}