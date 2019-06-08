package kotlinIn.capture3.`3`

class User(val id: Int, val name: String, val address: String)

fun main(args: Array<String>) {
    val oleg = User(3, "Oleg", "Lenina")
    val sane = "dd"
    val das: String = "dd"
    oleg.validateBeforeSave()
}

fun saveUser3(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun saveUser4(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}