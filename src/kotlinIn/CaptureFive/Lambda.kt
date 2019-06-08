package kotlinIn.CaptureFive

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name })
    people.filter { it.age > 30 }.map(Person::name)
    people.filter { it.age == people.maxBy(Person::age)?.age }

    val maxAge = people.maxBy(Person::age)?.age
    val re = people.filter { it.age == maxAge }
    println(re.map { it.name })



}

