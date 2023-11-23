fun main(args: Array<String>) {

    println("Calculator Program")
    val calculator = Calculator()
    val addition = calculator.addition(num1 = 10, num2 = 2)
    println("Addition:$addition")

    val subtraction = calculator.subtraction(num1 = 10, num2 = 2.5)
    println("Subtraction:$subtraction")

    val multiplication = calculator.multiplication(num1 = 10, num2 = 220, num3 = 5)
    println("Multiplication:$multiplication")

    val division = calculator.division(num1 = 100, num2 = 22.5f)
    println("Multiplication:$division")
}
