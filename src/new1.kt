fun main(args: Array<String>) {
    firstFun()
    firstFun2(44)
    val result = my4Fun(3, 5)
    println(result)
}

fun firstFun(): Int {

    return 1
}

fun firstFun2(a: Long): Int {
    return a.toInt()
}

fun my3Fun() {

}

fun my4Fun(a: Long, b: Int) = a + b