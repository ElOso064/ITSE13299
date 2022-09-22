package week04
// Josue Barajas - 04.4 Assignment - 09/21/2022
fun main (){
    var sales =IntArray(5)
    for (i in 1..5){
        println("Please enter sales for store: ")
        sales[i-1] = Integer.valueOf(readLine())
    }
    println("BAR CHART")
    for (i in 0..4)
        println("Store ${i+1}: ${"*".repeat(sales[i]/100)}")
}