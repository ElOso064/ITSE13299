fun main() {
    // PSEUDOCODE ask user to input their weight then convert it to a int.
    println("Please enter your weight in pounds >> ")
    val weight = Integer.valueOf(readLine())
    // PSEUDOCODE ask user to input their weight then convert it to int.
    println("Please enter your height in inches >> ")
    val height = Integer.valueOf(readLine())
    // PSEUDOCODE create a equation that calculates BMI
    val calculateBMI = (weight*703)/(height*height)
        // PSEUDOCODE create if statements for each, if user is underweight or overweight
        if (calculateBMI > 25 ){
            println("You are overweight.") }
        if (calculateBMI < 18.5 ){
            println("You are underweight.") }
    // PSEUDOCODE show user their BMI
    println("Your BMI is $calculateBMI.")
}

