package week05
// Josue Barajas - 05.4 Assignment - Oct 20, 2022
fun main(){
    for(i in 0 .. 10)
        println(fallingDistance(i))

}

fun fallingDistance(fallSeconds: Int): Double{
    var distance = .5*(9.8*(fallSeconds*fallSeconds))
    return distance
}