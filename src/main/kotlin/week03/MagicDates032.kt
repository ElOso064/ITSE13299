fun main() {
    // PSEUDOCODE Ask user to input birth month then store it and convert to a integer.
    println("Please enter your birth month >> ")
    val userBirthMonth = Integer.valueOf(readLine())
    // PSEUDOCODE Ask user to input birth day then store it and convert to a integer.
    println("Now please enter the day you where born >> ")
    val userBirthDay = Integer.valueOf(readLine())
    // PSEUDOCODE Ask user to input last 2 years of birth then store it and convert to a integer.
    println("Lastly, please enter the the last 2 years of the year you where born >> ")
    val userBirthYear = Integer.valueOf(readLine())
    // PSEUDOCODE create a equation, do a if statement to display message if birthday is magical or not
    if (userBirthYear == userBirthMonth+userBirthDay){
        println("The date you where born is magical!") }

    // PSEUDOCODE create another if statement to display message if birthday IS magical.

    if (userBirthYear != userBirthMonth+userBirthDay){
        println("The date you where born in not magical") }
}