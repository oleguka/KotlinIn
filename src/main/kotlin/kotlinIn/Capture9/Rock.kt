package kotlinIn.Capture9

open class Rock(val number: Int, val name: String) : Music<Rock> {
    override fun play(): Rock {
        return Rock(number, name)
    }
}