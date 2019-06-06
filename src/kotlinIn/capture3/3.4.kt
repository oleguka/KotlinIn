package kotlinIn.capture3

fun main(args: Array<String>) {
    val list = arrayListOf<Byte>(1, 2, 3)
    println(list.joinToString())
    println(listOf("one", "two", "eight").join(" "))
    println("12.345-6.A".split("\\.|-".toRegex()))
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)