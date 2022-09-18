fun main() {
    // PSEUDOCODE ask user to input 3 names.
    println("Please enter a name. ")
    var firstName = readLine()!!
    println("Now please enter a second name. ")
    var secondName = readLine()!!
    println("Finally, please enter a third name. ")
    var thirdName = readLine()!!
    // After asking user for 3 names, create conditional if statements to put them in order.
    if(firstName > secondName){
        val holder = firstName
       firstName = secondName
        secondName = holder
    }
    if(secondName > thirdName){
        val holder = secondName
        secondName = thirdName
        thirdName = holder
    }
    if(firstName > secondName){
        val holder = firstName
        firstName = secondName
        secondName = holder
    }
    // Lastly, display the names in order.
    println(firstName)
    println(secondName)
    println(thirdName)
}
