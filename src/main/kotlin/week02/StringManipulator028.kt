package week02

fun main(){
    println("Please enter the name of your favorite city >> ")
    val favCity = readLine()!!
    val favCityLength = favCity.length
    println("The length of letter in the city are " favCityLength)
    val cityUpperCase = favCity.uppercase()
    println("City in all caps: " cityUpperCase)
    val cityLowerCase = favCity.lowercase()
    println("City in all lower case " cityLowerCase)

}
