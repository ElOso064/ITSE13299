package week03
    // Josue Barajas - Assignment 03.8 - Sept 18 2022
fun main() {
    val baseFee = 10.0
    println("Please the amount of checks written for this month.")
    val checksWritten = Integer.valueOf(readLine())
    var total = 0.0

        if (checksWritten <= 19) {
            total = baseFee + (checksWritten*0.10)
        }
        if (checksWritten >= 20 ){
            total = baseFee + (checksWritten*0.08)
        }
        if (checksWritten >= 40){
             total = baseFee + (checksWritten*0.06)
        }
        if (checksWritten >= 60){
            total = baseFee + (checksWritten*0.04)
        }

    println("The banks service fee is $ $total")

}