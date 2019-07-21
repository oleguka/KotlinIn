fun fibonachi(first: Long) {
    var a: Long = first
    var b: Long = 0
    var i = 0

    print("$b $a ")

    val sum = { x: Long, y: Long -> x + y }

    while (i != 100) {
        var c: Long = sum(a, b)
        println("$c ")
        b = a
        a = c
        i++
    }
}



fun main() {
    fibonachi(1)
}