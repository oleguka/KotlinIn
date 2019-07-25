package kotlinIn.Capture8

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun main() {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }

    println("ab23c".filter { it in '0'..'9' })

    setValue { n, m -> n + m }

    val sum = { x: Int, y: Int -> x + y }

}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun setValue(operation: (selector: String, value: String) -> String) {
    val result = operation("#main", "45")
    println("Operation: $result")
}

