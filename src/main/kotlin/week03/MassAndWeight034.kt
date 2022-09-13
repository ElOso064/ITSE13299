fun main() {
    println("Please enter the objects mass.")
    val mass = Integer.valueOf(readLine())
    val weight = mass * 9.8
        if (weight > 1000){
            println("This object is too heavy.") }
    if (weight < 10){
        println("This object is too light.")
    }
}
