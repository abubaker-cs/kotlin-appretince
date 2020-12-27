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



    // Short Circuiting

    // Encapsulating Variables

    // >>> Exercises

    /*
     *****************************************    While
     */

    // Repeat-While

    // Break

    // >>> Exercises


    /*
     *****************************************    Challenges
     */
}