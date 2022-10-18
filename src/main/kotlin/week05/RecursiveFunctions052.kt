package week05
// Josue Barajas - 05.2 Assignment - Oct 18th, 2022
fun main() {
    println(fibonacci(1))
}

fun fibonacci(number: Int): Int{
    if(number == 1 || number == 2)
        return 1
    var sum = fibonacci(number -1) + fibonacci(number -2)
    return sum
}