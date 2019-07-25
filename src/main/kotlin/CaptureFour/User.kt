package CaptureFour

class User private constructor(val nickname: String){
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

        val famil = "tolstyk"

        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String {
            return "123"
        }
    }
}