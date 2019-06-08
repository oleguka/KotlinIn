package kotlinIn.CaptureSix

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)

    printHashCode(null)
}

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printHashCode1(t: T) {
    println(t.hashCode())
}