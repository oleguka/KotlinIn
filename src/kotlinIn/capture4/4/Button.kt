package kotlinIn.capture4.`4`

class Button : Clicable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super <Clicable>.showOff()
        super <Focusable>.showOff()
    }
}