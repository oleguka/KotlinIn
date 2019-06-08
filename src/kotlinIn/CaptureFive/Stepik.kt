package kotlinIn.CaptureFive

fun main() {


    val sort = listOf("5", "4", "3", "2", "1", "6", "7", "8", "9", "10")
    println(bubbleSort(sort))

}


fun bubbleSort(inputList: List<String>): IntArray {
    val intList = inputList.map { it.toInt() }

    val arrL = intList.toIntArray()

    var t: Int

    for (i in 0 .. arrL.size) {
        for (j in 0 .. (arrL.size-i)) {
            if (arrL[j-1] > arrL[j]) {
                t = arrL[j-1]
                arrL[j-1] = arrL[j]
                arrL[j] = t
            }
        }
    }


    return arrL

}