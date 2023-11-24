class Calculator : Basics {
    override var name : String = "Calculator Program"

    override fun addition(num1: Int, num2: Int) : Int {
        return  num1 + num2
    }

    override fun subtraction(num1: Int, num2: Double): Double {
        return num1 - num2
    }

    override fun multiplication(num1: Int, num2: Long, num3: Short): Long {
        return num1 * num2 * num3
    }

    override fun division(num1: Int, num2: Float): Float {
        return num1 / num2
    }
}