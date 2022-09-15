package week02

fun main(){
    println("Please enter the name of your favorite city >> ")
    val favCity = readLine()!!
     if (favCity != null){
         println("The number of characters in the city name are: " + favCity.length)
         println("The name of the city in upper case: " + favCity.uppercase())
         println("The name in city in all lower case: " + favCity.lowercase())
         println("The first character in the name of the city is: " +favCity.first())
         // Josue Barajas Assignment -  String Manipulator 02.8 - Sept 14th 2022
     }


}
