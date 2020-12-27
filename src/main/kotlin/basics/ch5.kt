package basics

fun main(){
    /*
        Exercises: Ch-5
     */
    println("Chapter 5: Advanced Control Flow")

    /*
     *****************************************    Ranges
     */

    val closedRange = 0..5
    println(closedRange)

    val halfOpenRange = 0 until 5
    println(halfOpenRange)

    val decreasingRange = 5 downTo 0
    println(decreasingRange)


    /*
     *****************************************    For
     */

    val count = 10
    var sum = 0
    for (i in 1..count){
        sum += 1
        println("Sum + 1: $sum")
    }

    // repeat() Loop
    sum = 1
    var lastSum = 0
    repeat(10){
        val teamp = sum
        sum += lastSum
        lastSum = sum
        println("Last Sum: $lastSum")
    }

    // Steps: 1, 3, 5, 7, 9 (step 2)
    sum = 0
    for (i in 1..count step 2){
        sum += 1
        println("Sum: $sum and i: $i")
    }

    // Steps 10, 8, 6, 4, 2
    sum = 0
    for (i in count downTo 1 step 2){
        sum += 1
        println("Sum with downTo: $sum and i: $i")
    }

    // Labeled Statements
    sum = 0
    for (row in 0 until 8){

        if (row % 2 == 0) {
            println("**** Skipping Row #$row ****")
            continue
        }

        for (column in 0 until 8) {
            sum += row * column
            println("Row: $row and Column $column, with Sum: $sum")
        }

    }

    // Skip top-right corner of the BOX
    sum = 0
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {

            if (row == column) {
                println("*** Skipping Row #$row and Column #$column ***")
                continue@rowLoop
            }

            sum += row * column
            println("Printing in Row: $row and Column $column, with Sum: $sum")
        }
    }



    // >>> Exercises

    /*
     *****************************************    When
     */

    val number = 10
    when (number) {
        0 -> println("Zero")
        else -> println("Your provided number is Not listed in the index.")
    }

    when (number) {
        10 -> println("Found it, you was looking for Ten (10)")
    }

    val string = "Cat"
    when (string){
        "Cat", "Dog" -> println("$string is a house pet.")
        else -> println("$string is Not a house pet.")
    }

    // Returning Values




    // Advanced When Expressions

    // >>> Exercises

    /*
     *****************************************    Challenges
     */

}