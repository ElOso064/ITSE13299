package week05
// Josue Barajas - 05.3 Assignment - Oct. 20, 2022
fun main() {
    println("Enter a items whosesale cost >> ")
    val wholeslCost = readLine()!!.toDouble()
    println("Enter a items markup percentage >> ")
    val markupPctg = readLine()!!.toDouble()
    println("The retail price of the item is $ ${calculateRetail(wholeslCost,markupPctg)}. ")

}

fun calculateRetail(wholecost: Double, markup: Double): Double {
    var retailPrice = (wholecost*((markup/100)+1))
    return retailPrice
}