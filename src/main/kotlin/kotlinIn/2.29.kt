package kotlinIn

import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("rr"))
    readNumber2(reader)
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}