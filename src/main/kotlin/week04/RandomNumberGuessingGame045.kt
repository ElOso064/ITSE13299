package week04
// Josue Barajas - September 15th - 04.5 Assignment
fun main() {

 val myNumber = (0 .. 10).random()

    println("Guess a number 1-10:")
    val guess = Integer.valueOf(readLine())

    println("My number is: " +myNumber)
    println("Your guess: " +guess)
        if (guess < myNumber){
            println("Your guess is too low, go up a little!")
        }

        if (guess > myNumber){
            println("Your guess is too high, go down a little!")
        }

        if (guess == myNumber){
            println("Bingo! You guessed my number!!")
        }
}
