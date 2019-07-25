package kotlinIn.CaptureSix

fun <T> copyElements(sourse: Collection<T>, target: MutableCollection<T>) {
    for (item in sourse) {
        target.add(item)
    }
}

fun main() {

    var argo: Collection<String> = arrayListOf("ddd", "dde", "ddr")
    var list: List<String>
    var mutableList: MutableList<String>

    val sourse: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(sourse, target)
    println(target)
}