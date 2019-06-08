package kotlinIn.capture3

fun main(args: Array<String>) {
    parsePath1("Users/yole/kotlin-book/chapter.adoc")

    val kotlinLogo = """| //
        | . |//
        | . |/\
    """.trimMargin()
    println(kotlinLogo)

    val price = """${'$'}99.9"""
}

fun parsePath1(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extention) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extention")
    }
}