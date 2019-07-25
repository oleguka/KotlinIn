package kotlinIn.CaptureSix

fun  showProgress(progress: Int) {
    val persent = progress.coerceIn(0, 100)
    println("We're $persent% done!")
}

fun main() {
    showProgress(99)

    println(Person1("Bob", 34).isOlderThan(Person1("Oleg", 24)))

    val answer: Any = 1

    fail("Error")


}

data class Person1(val name: String, val age: Int?) {
    fun isOlderThan(other: Person1): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}