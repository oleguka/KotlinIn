package kotlinIn.capture3

fun main(args: Array<String>) {
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)


    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val (number, name) = 1 to "one"
}

val String.lastChar: Char
get() = get(length - 1)

var StringBuilder.lastChar: Char
get() = get(length - 1)
set(value: Char) {
    this.setCharAt(length - 1, value)
}

infix fun Any.to(other: Any) = Pair(this, other)

fun <K, V> mapOf(vararg values: Pair<K, V>): Map<K, V>? {
    return null
}
