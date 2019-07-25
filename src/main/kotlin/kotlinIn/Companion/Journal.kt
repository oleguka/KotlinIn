package kotlinIn.Companion

//class Journal(value: String){
//    companion object : Book {
//        override fun ready(text: String)
//    }
//}

fun main() {

    val mouse = Mouse.Loader.from("{name: 'SAS'}")
    println(mouse.name)

}

class Mouse(val name: String) {
    companion object Loader {
        fun from(text: String): Mouse{
            return Mouse("oleg")
        }
    }
}