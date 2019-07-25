package kotlinIn.CaptureFive

class Book(val title: String, val autor: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books =  listOf(Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(books.flatMap { it.autor }.toSet())
}