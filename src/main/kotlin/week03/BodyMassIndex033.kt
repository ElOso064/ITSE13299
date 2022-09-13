fun main() {

    println("Please enter your weight in pounds >> ")
    val weight = Integer.valueOf(readLine())
    println("Please enter your height in inches >> ")
    val height = Integer.valueOf(readLine())
    val calculateBMI = (weight*703)/(height*height)
        if (calculateBMI > 25 ){
            println("You are overweight.") }
        if (calculateBMI < 18.5 ){
            println("You are underweight.") }

    println("Your BMI is $calculateBMI .")
}

