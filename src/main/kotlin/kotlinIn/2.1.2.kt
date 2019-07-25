package kotlinIn

fun main(args: Array<String>) {
    println(max(7, 3))
    println(min(5, 3))

    val langua = arrayListOf("java")
    langua.add("kot")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, n: Int) = if (a < n) a else n

