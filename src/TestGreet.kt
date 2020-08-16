
class TestGreet {
    companion object {

        fun testGreet(name: String?): Boolean {
            val output = Greet.greet(name)
            if (name != null)
                return output == "Hello, $name."
            else
                return output == "Hello, my friend."
        }
    }
}