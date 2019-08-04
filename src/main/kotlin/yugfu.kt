//package kotlinIn
//
//import java.io.BufferedReader
//import java.io.StringReader
//
//fun main(args: Array<String>) {
//    val reader = BufferedReader(StringReader("rr"))
//    readNumber1(reader)
//}
//
//fun readNumber1(reader: BufferedReader) {
//    val number = try {
//        Integer.parseInt(reader.readLine())
//    } catch (e: NumberFormatException) {
//        return
//    }
//    println(number)
//}