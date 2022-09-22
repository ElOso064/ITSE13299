package week04

fun main() {
    println("Please enter a whole number from 1-50 >> ")
    var userNumber = Integer.valueOf(readLine())
    var finalNumber = 0
    var i =0
    var limit = userNumber

    for ( i in 0 until limit){
        finalNumber += i
        println(finalNumber)
    }

    println("The sum of all your numbers is ")
}
