fun main() {
    // PSEUDOCODE ask user to input a objects mass then store it in a int
    println("Please enter the objects mass.")
    val mass = Integer.valueOf(readLine())
    // PSEUDOCODE create equation to calculate a objects newtons
    val weight = mass * 9.8
    // PSEUDOCODE do if statements for each , if object is too heavy or too light and display it to user.
        if (weight > 1000){
            println("This object is too heavy.") }
    if (weight < 10){
        println("This object is too light.")
    }
}
