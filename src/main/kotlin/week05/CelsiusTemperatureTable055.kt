package week05
// Josue Barajas - 05.5 Assignment - Oct 20, 2022
fun main(){
    for(i in 0 .. 20)
        println(celcius(i))
}


fun celcius(degree: Int): Double{
    var conversion = (5.0/9 *(degree-32))
    return conversion.toDouble()
}