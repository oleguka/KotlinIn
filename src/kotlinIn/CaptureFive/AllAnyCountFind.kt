package kotlinIn.CaptureFive

fun main(args: Array<String>) {
    val canBenInClub27 = { p:Person -> p.age <= 27 }

    val people = listOf(Person("Alice", 27), Person("Bob", 34))
    println(people.all(canBenInClub27))

    println(people.any(canBenInClub27))

    println(people.count(canBenInClub27))

    println(people.find(canBenInClub27))

    println(people.find { it.age == 34 })
}