package basics

fun main(){
    /*
        Exercises: Ch-6
     */
    println("Chapter 6: Functions")

    /*
     *****************************************    Basics
     */
    fun printMyName() {
        println("My name is Mohammad Abubaker")
    }

    printMyName()

    // Single Parameter
    fun printMultipleOfFive(value: Int){
        println("$value * 5 = ${value * 5}")
    }
    printMultipleOfFive(10)

    // Two Parameters
    fun printMultipleOf(multiplier: Int, andValue: Int) {
        println("$multiplier * $andValue = ${multiplier * andValue}")
    }
    printMultipleOf(multiplier = 4, andValue = 3)

    // Initial value (Fallback)
    fun printXOf(multiplier: Int, value: Int = 1){
        println("$multiplier * $value = ${multiplier * value}")
    }
    printXOf(4)


    // Return Values
    fun multiply(number: Int, multiplier: Int) : Int {
        return number * multiplier
    }
    println("Result: ${multiply(4,6)}")

    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int>{
        return Pair(number * factor, number / factor)
    }
    val (product, quotient) = multiplyAndDivide(4,2)
    println("Product: $product, Quotient: $quotient")


    // Single line function
    fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier
    println("Single Line: ${multiplyInferred(3, 4)}")


    // Parameters are constant, they cannot be modified; so it is better to save changes in a new var (variable)
    // and then return back the newly assigned variable
    fun incrementAndPrint(value: Int) : Int {
        val newValue = value + 1
        println(newValue)
        return newValue
    }
    println("4 + 1 = ${incrementAndPrint(4)}")

    // Overloading

    // >>> Exercises

    /*
     *****************************************    Func As Variables
     */

    // No Return (Nothing)

    // Writing good functions

    /*
     *****************************************    Challenges
     */


}