package basics

fun main() {
    /*
        Exercises: Ch-3
     */
    println("Chapter 3 - Types & Operations")

    // 1. Type Conversion - (Theory)
    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()
    println("Decimal: $decimal")
    println("Integer: $integer")

    // Operators with mixed types
    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked.toDouble() // Note: .toDouble is not required here, as the result will be always in double in current context
    println("Total Cost: $totalCost")

    // Type inference (auto decide data type)
    val typeInferredInt = 42
    println("Type Inferred Value: $typeInferredInt")

    val wantADouble: Double = 3.0
    println("Want a Double? $wantADouble")

    //    --- Mini Exercise
    val age1 = 42
    val age2 = 21

    val avg1 = (age1 + age2) / 2.0
    println("Average of age1 + age2: $avg1")

    // 2. Strings - (Theory)

    /*
           Char - Single 'a'
           String = Double "abc"
     */

    val characterA: Char = 'a'
    println("Character: $characterA")

    val stringDog: String = "Dog"
    println("String: $stringDog")

    // Concentration + for joining strings
    var message = "Hello " + " my name is "
    val name = "Abubaker"
    message += name
    println("Message: " + message)

    // Tip: ALT + Shift + Enter > Converts concentration to String Template
    println("Message converted to String Template: $message")


    /*
        Limitation of String Template: Their output cannot be controlled / formatted for precision of DATA
     */

    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One third is $oneThird as a decimal"
    println(oneThirdLongString)

    /*
    *   We can put EXPRESSIONS (Calculations) inside the String Templates
    * */
    val stExpression = "One third is ${1.0 / 3.0} as a decimal"
    println("Expression: $stExpression")


    // Multi-line Strings
    val bigString = """
        |You can have a string
        |that contains multiple
        |lines
        |by
        |doing this.
    """.trimMargin()

    println(bigString)

    //    --- Mini Exercise
    val firstName = "Mohammad"
    val lastName = "Abubaker"

    val fullName = "$firstName $lastName"

    val myDetails = "Hello, my name is $fullName"
    println(myDetails)


    // 3. Pairs & Triples

    /*
        2D - Pairs (x,y)
        3D - Triples (x,y,z)
        3D+ - Data Class (x,y,z, ... , n)
     */

    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinatesInferred =  Pair(3,5)

    // to operator
    val coordinatesWithTo = 2 to 4.0

    val x1 = coordinates.first
    val x2 = coordinates.second
    println("X: $x1, Y: $x2")

    val y1 = coordinatesWithTo.first
    val y2 = coordinatesWithTo.second
    println("X: $y1, Y: $y2")

    // Best approach is to use "Destructing Declaration" while extracting values form teh Pair
    val (x,y) = coordinatesWithTo
    println("X: $x, Y: $y")

    /*
        _ = Ignores / Skips EXTRACTING value from Tuple or Pair
     */

    val coordinates3D = Triple(2,3,1)
    val (x3, y3, _) = coordinates3D
    println("X3: $x3")
    println("Y3: $y3")



    // 4. Number Types

    /*
        Whole Numbers
        - Byte (1 byte)
        - Short (2 bytes)
        - Int (4 bytes)
        - Long (8 bytes)

        Frictional Numbers:
        - Float (1 byte)
        - Double (2 bytes)

     */

    // 5. Any, Unit and Nothing Types

    /*
        Any = Object (in Java - Mother of All Types, except Primitives)
        Unit = Void (in Java - Returns Nothing)
        Nothing = Infinite Loop and Returns Nothing (UNIT / VOID)
     */


    /*
        Challenge
     */

    // 1 & 2
    val xd = Pair("two", "three")
    val (col, row) = xd
    println("Col: $col, Row: $row")

    // 3
    val character: Char = 'd'
    val string: String = "dd"

    // 4
    val date = Triple(15, 8, 2015)
    val day = date.first
    println("Day: $day")

    // 6
    val triple = Triple(100, 1.5, 10)
    val value = triple.second // Double Value

    // 7
    val newDate = Triple (15, 8, 2015)
    val month = newDate.second // Int Value

    // 8
    val number = 10
    val multiplier = 5
    val summary = "$number multipled by $multiplier equals ${number * multiplier}" // String

    // 9
    val a = 4
    val b: Short = 100
    val c: Byte = 12
    val sum = a + b - c // 92 - Int value
    println("Sum $sum")

    // 11
    /*
        kotlin.math.PI = 3.141592653589793
        kotlin.math.PI.toFloat() = 3.1415927
     */
    val compareResult = kotlin.math.PI
    println("Compare: $compareResult")



}