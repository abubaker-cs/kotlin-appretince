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
    val numberName = when (number){
        2 -> "Two"
        3 -> "Three"
        8 -> "Eight"
        10 -> "Ten"
        else -> {
            println("Unknown Number")
            "Unknown"
        }
    }
    println(numberName)



    // Complex
    val hourOfDay = 120
    var timeOfTheDay : String = ""

    timeOfTheDay = when (hourOfDay) {
        0,1,2,3,4,5 -> "Early Morning"
        6,7,8,9,10,11 -> "Morning"
        12,13,14,15,16 -> "Afternoon"
        17,18,19 -> "Evening"
        20,21,22,23 -> "Late Evening"
        else -> "INVALID Hour"
    }

    println(timeOfTheDay)

    // Advanced When Expressions

    val xhourOfDay = 11
    var xtimeOfTheDay : String = ""

    xtimeOfTheDay = when (xhourOfDay) {
        in 0..5 -> "Early Morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late Evening"
        else -> "INVALID Hour"
    }

    println(xtimeOfTheDay)

    // Finding Even
    when {
        number % 2 == 0 -> println("$number is Even")
        else -> "$number is Odd"
    }

    // Finding Origin in x,y,z axis
    var x = 0
    var y = 0
    var z = 3

    when {
        x == 0 && y == 0 && z == 0 -> println("Origin")
        y ==0 && z == 0 -> println("On the X-Axis at x = $x")
        x ==0 && z == 0 -> println("On the Y-Axis at y = $y")
        x ==0 && y == 0 -> println("On the Z-Axis at z = $z")
        else -> println("Somewhere in space at x = $x, y = $y and z = $z")
    }

    // More Complex
    when {
        x == y -> println("Along the y = x line.")
        y == x * x -> println("Along the y = x^2 line.")
    }

    // >>> Exercises

    /*
     *****************************************    Challenges
     */

}