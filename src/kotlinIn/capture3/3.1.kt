package kotlinIn.capture3

fun String.lastChar(): Char = get(length - 1)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, prefix = "'"))
    reportOperationCount()

    println("Kotlin".lastChar())
}

var coint = 0

fun performOperation() {
    coint++
}

fun reportOperationCount() {
    performOperation()
    println("Operation $coint")
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}