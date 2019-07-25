package kotlinIn.capture3

fun main(args: Array<String>) {
    val nameLdx: View = Button()
    nameLdx.click()
    nameLdx.newFun()
}

open class View {
    open fun click() = println("view clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.newFun() = println("azaza")
fun Button.newFun() = println("rassh")