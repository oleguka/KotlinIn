data class Book(val author: String, val title: String, val year: Int, val publusher: Publisher)


fun main(args: Array<String>) {
    val amedia = Publisher("Amedia corp")

    val book1 = Book("Lermontov", "GNV", 1814, amedia)
    val book2 = book1.copy(title = "Daemon", year = 1856)

    val (name, tit) = book2

    println(tit)

    println("${book2.author} ${book2.title}")
    println(book2.year)
    println(book2.publusher.name)
}