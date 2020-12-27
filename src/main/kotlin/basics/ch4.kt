package basics

fun main(){
    /*
        Exercises: Ch-4
     */
    println("Chapter 4: Basic Control Flow")

    /*
     *****************************************    Boolean
     */

    val yes: Boolean = true
    val no: Boolean = false

    val yes_x = true
    val no_x = false

    // Boolean Operators

    /// == Equals to
    val doesOneEqualsTwo = (1 == 2)
    println("1 == 2 : $doesOneEqualsTwo")

    /// != Not Equal
    val doesOneNotEqualsTwo = (1 != 2)
    println("1 != 2 : $doesOneNotEqualsTwo")

    /// ! Not (Switch)
    val alsoTrue = !(1 == 2)
    println("!(1==2) : $alsoTrue")

    /// > Greater than
    val isOneGreaterThanTwo = (1 > 2)
    println("1 > 2 : $isOneGreaterThanTwo")

    /// < Less than
    val isOneLessThanTwo = (1 < 2)
    println("1 < 2 : $isOneLessThanTwo")

    /// >= Greater than or Equals to
    val isOneGreaterThanOrEqualsTwo = (1 >= 2)
    println("1 >= 2 : $isOneGreaterThanOrEqualsTwo")

    /// <= Less than or Equals to
    val isOneLessThanOrEqualsTwo = (1 <= 2)
    println("1 <= 2 : $isOneLessThanOrEqualsTwo")

    // && And
    val and = true && true
    println("Ture && Ture: $and")

    // || OR
    val or = true or false
    println("True || False: $or")

    // && ||
    val andOr = (1 < 2 && 3 > 4) || 1 < 4
    println("(1 < 2 && 3 > 4) || 1 < 4: $andOr")

    // String Equality?
    val guess = "dog"
    val dogEqualsCat = guess == "cat"
    println("dog == cat? $dogEqualsCat")

    val order = "cat" < "dog"
    print("Oder Cat < Dog: $order")

    // >>> Mini Exercises

    // 1
    val myAge = 16
    val amIaTeenager = (myAge > 13) && (myAge < 19)
    println("Am I a teeanger? $amIaTeenager")

    // 2
    val theirAge = 15
    val isHeaTeenager = (theirAge > 13) && (theirAge < 19)

    val bothTeenagers = amIaTeenager && isHeaTeenager
    println("Are we both teenagers? $bothTeenagers")

    // 3
    val reader = "Abubaker"
    val author = "Richard"
    val authorIsReader = reader == author
    println("Is author and reader same? $authorIsReader")

    // v4
    val readerBeforeAuthor = reader < author
    println("Does reader comes before author? $readerBeforeAuthor")

    /*
     *****************************************    If
     */

    if (2 > 1) {
        println("Yes, 2 is greater than 1.")
    }

    val animal = "Fox"
    if (animal == "Cat" || animal == "Dog") {
        println("Animal is a house pet")
    } else {
        println("Animal is not a house pet.")
    }

    val a = 5
    val b = 10
    val min = if ( a < b ) a else b
    val max = if ( a > b ) a else b


    val hourOfDay = 12
    val timeOfDay = if(hourOfDay < 6) {
        "Early Morning"
    } else if(hourOfDay < 12) {
       "Morning"
    } else if(hourOfDay < 17) {
        "Afternoon"
    } else if(hourOfDay < 20) {
        "Evening"
    } else if(hourOfDay < 24) {
        "Late Evening"
    } else {
        "Invalid Hour"
    }
    println(timeOfDay)

    // Short Circuiting
    var name = "Matt"
    if (1 > 2 && name == "Matt"){
        println("It will be NEVER Printed, as both statements are not true")
    }

    if (1 > 2 || name == "Matt"){
        println("It will be Printed, as at least 1 statement is true")
    }

    // Encapsulating Variables (Scope)
    var hoursWorked = 55

    var price = 0

    if(hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
    }

    price += hoursWorked * 25
    println("Total Price $price")

    // >>> Exercises

    // 1.
    val myAgeT = 36
    if(myAgeT > 13 && myAgeT < 19) {
        println("You are a Teenager")
    } else {
        println("Sorry, are your not a teenager")
    }

    // 2.


    /*
     *****************************************    While
     */


    // While
    var sum = 1
    while (sum < 10){
        sum += sum + 1
        println("Sum: $sum")
    }

    // Do-While
    var sum_do = 1
    do {
        sum_do += sum_do + 1
        println("Sum_DO: $sum_do")
    } while (sum_do < 10)

    // Break
    var sum_break = 1
    while (true) {
        sum_break += sum_break + 1
        println("Sum_break: $sum_break")
        if (sum_break >=10){
            break
        }
    }

    // >>> Exercises


    /*
     *****************************************    Challenges
     */
}