package kotlinIn.CaptureFive

fun main() {
    val people = listOf(Person("Alice", 32), Person("Bob", 32), Person("Oleg", 24), Person("Bob", 27))
    println(people.groupBy{ it.name })

    val list = listOf("abc", "ab", "b")
    println(list.groupBy(String::first))
}