package kotlinIn.CaptureFive

fun main() {
    createAllDoneRunnable().run()

    println(alphabet())

    println(alphabet1())

    println(alphabet2())

}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun alphabet()= with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
    toString()
}

fun alphabet1() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I Know the alphabet")
}.toString()

fun alphabet2() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}