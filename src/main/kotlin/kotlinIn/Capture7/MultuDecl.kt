package kotlinIn.Capture7



fun main() {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)
    val (name, ext) = splitFileName("example.kt")
    println(name)
    println(ext)

    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
}

data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}