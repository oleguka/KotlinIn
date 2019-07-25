package kotlinIn.CaptureFive

import java.io.File

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDir())


}

fun File.isInsideHiddenDir() = generateSequence(this) { it.parentFile }.any { it.isHidden }
