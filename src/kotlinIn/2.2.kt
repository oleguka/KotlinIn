package kotlinIn

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}

fun well(args: Array<String>) {
    if (args.size > 0) {
        println("Hello, ${args[0]}")
    }
}