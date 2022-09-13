fun main() {
    println("Please enter your birth month >> ")
    val userBirthMonth = Integer.valueOf(readLine())
    println("Now please enter the day you where born >> ")
    val userBirthDay = Integer.valueOf(readLine())
    println("Lastly, please enter the the last 2 years of the year you where born >> ")
    val userBirthYear = Integer.valueOf(readLine())

    if (userBirthYear == userBirthMonth+userBirthDay){
        println("The date you where born is magical!") }

    if (userBirthYear != userBirthMonth+userBirthDay){
        println("The date you where born in not magical") }
}