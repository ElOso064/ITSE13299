package week02

fun main(){
    val cookiesInBag = 40
    val servingsInBag = 10
    val cookiesPerServing = ((cookiesInBag/servingsInBag))
    val caloriesPerServing = 300
    val caloriesPerCookie = (caloriesPerServing/cookiesPerServing)

    println("Please enter amount of cookies eaten: ")
    val cookies = Integer.valueOf(readLine())
    var calories = caloriesPerCookie*cookies
    println("Your calorie intake was: $calories")



}