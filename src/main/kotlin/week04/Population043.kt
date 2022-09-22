package week04
// Josue Barajas - 04.2 Assignment - 09/21/2022
fun main(){

    println("Please enter the population of bears in Texas (keep it within 50) >> ")
    var begQtBears = readLine()!!.toDouble()
        while(begQtBears < 2){
            println("Please enter a quantity more than 2")
            begQtBears = readLine()!!.toDouble()
        }
    println("Please enter the daily percentage increase of bears in texas (decimal number only)")
    val percIncrease = readLine()!!.toDouble() / 100
    println("How many days will the bear population multiply?")
    val dayIncrease = Integer.valueOf(readLine())
        for (i in 0 .. dayIncrease - 1){
            begQtBears = begQtBears* (percIncrease +1)
        }

    println("The amount of bears in Texas has increased to $begQtBears in $dayIncrease days.")
}
