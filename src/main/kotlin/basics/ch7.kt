package basics

fun main() {
    /*
        Exercises: Ch-7
     */
    println("Chapter 7: Nullability")

    /*
     *****************************************    Null
     */

    var name = "Joe Howard"
    var age = 24
    var occupation= "Software Developer & Author"


    // Sentinel Values

    // var errorCode = 0

    /*
     *****************************************    Types
     */
    var errorCode: Int?
    errorCode = 100
    errorCode = null

    // >>> Exercises

    // 1
    var myFavoriteSong : String?

    // 2
    var parsedInt = "10".toIntOrNull()
    // parsedInt = "Dog"

    /*
     *****************************************    Checking for Null
     */

    var result: Int? = 30
    println(result)
    // println(result + 1)

    // Not-Null assertion Operator
    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24


    // Method 1 - Not-Null Assertion Operator (Do not use it)
    val ageAfterBirthday = authorAge!! + 1
    println("After their next birthday, author will be $ageAfterBirthday")

    authorAge = 30
    println("After two birthdays, author will be ${authorAge!! + 2}")

    authorAge = null
    // println("After two birthdays, author will be ${authorAge!! + 2}")
    // Issue > Container with Null Value cannot add content, it will cause Null-Exception Error and app will Crash


    // Smart Casts
    authorName = null

    var nonNullableAuthor: String
    var nullableAuthor: String?

    if(authorName != null){
        nonNullableAuthor = authorName
        println("Non-nullable Author: $nonNullableAuthor")
    } else {
        nullableAuthor = "Mohammad Abubaker"
        println("Nullable Author: $nullableAuthor")
    }

    // >> Exercises

    /*
     *****************************************    Safe Calls
     */

    // let()

    // Elvis Operator

    /*
     *****************************************    Challenges
     */

}