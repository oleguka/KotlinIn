package kotlinIn.CaptureSix

fun main() {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }
}

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}