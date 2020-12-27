package basics

fun main() {

    /*
        Exercises: Ch-2
     */
    println("Chapter 2 - Expressions, Variables & Constants")

    val myAge: Int = 38
    println("Age: $myAge")

    var testNumber: Double = 35.0
    var baseAverage : Double = testNumber / 2.0
    println("Average: $baseAverage")

    val evenOdd: Double = testNumber % 2.0
    println("evenOdd: $evenOdd")

    var answer : Int = 55
    answer += 1
    answer *= 10
    answer = answer shr 3

    println("Answer: $answer")

    /*
        Challenges
     */

    // 01
    val exercises : Int = 9
    var exercisesSolved : Int = 0
    exercisesSolved += 1

    // 02
    var age: Int = 16
    println("Initial Age: $age")
    age = 30
    println("New Age: $age")

    // 03

    val a: Int = 46
    val b: Int = 10

    // 1
    val answer1: Int = (a * 100) + b
    println("Answer1: $answer1")

    // 2
    val answer2: Int = (a * 100) + (b * 100)
    println("Answer1: $answer2")

    // 3
    val answer3: Int = (a * 100) + (b / 10)
    println("Answer1: $answer3")

    var performCalc = (5 * 3) - (4 / 2) * 2
    println("Perform Calc: $performCalc")

    val val1 : Double = 10.0
    val avg_val1: Double = val1 / 2

    val val2 : Double = 15.0
    val avg_val2: Double = val2 / 2

    val total_avg = avg_val1 + avg_val2
    println("Total Average= $total_avg")

    //

}