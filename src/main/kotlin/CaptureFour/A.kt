package CaptureFour

class A {

    fun top() {
        println("Top fun")
    }

    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main() {
    A.bar()

    val subscribUser = User.newSubscribingUser("oleg@gmail.com")
    val facebookUser = User.newFacebookUser(4)


    println(subscribUser.nickname)
    println(User.famil)
}