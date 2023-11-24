fun main(args: Array<String>) {

    val calculator = Calculator()
    //override
    val print : String = calculator.name
    println(print)
    val addition = calculator.addition(num1 = 10, num2 = 2)
    println("Addition:$addition")

    val subtraction = calculator.subtraction(num1 = 10, num2 = 2.5)
    println("Subtraction:$subtraction")

    val multiplication = calculator.multiplication(num1 = 10, num2 = 220, num3 = 5)
    println("Multiplication:$multiplication")

    val division = calculator.division(num1 = 100, num2 = 22.5f)
    println("Multiplication:$division")

    val person1 = Person("Alice", 25)
    val person2 = Person("Alice", 25)
    //componentN
    val people = listOf(Person("Alice", 30), Person("Bob", 25))
    for ((name, age) in people) {
        println("Name: $name, Age: $age")
    }
    println(person1 == person2)
    println(person1.hashCode())
    println(person2.hashCode())

    //let & run
    val nullableString: String? = null
    nullableString?.let {
        println(it)
    } ?: run {
        println("It to be Null")
    }
    //higher order function
    val func = operation()
    println( func(4) )

}
//higher order function
fun square(x: Int) = x * x
fun operation(): (Int) -> Int {
    return ::square
}
