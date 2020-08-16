open class Greet {
    companion object {
        protected fun isStringUpperCase(string: String): Boolean {
            val chars = string.toCharArray()
            for (char in chars) {
                if (!char.isUpperCase()) return false
            }
            return true
        }
        fun greet(name: String?): String {
            if (name != null)
                return "Hello, $name."
            else
                return "Hello, my friend."
        }
    }
}