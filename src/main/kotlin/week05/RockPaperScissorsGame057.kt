package week05
// Josue Barajas - 05.7 Assignment - Oct 20, 2022
fun main(){
    var gameWon = runGame()
    while(gameWon == 0)
        gameWon = runGame()
}

fun compMove(): Int{
    return (0..2).random()
}

fun getUserMove(): Int{
    println("Please choose Rock, Paper, Scissors >> ")
    var choices = arrayOf("Rock", "Paper", "Scissors ")
    var userChoice = readLine()
        while(userChoice !in choices){
            println("Invalid choice")
            userChoice = readLine()
        }
    return choices.indexOf(userChoice)
}

fun decideWinner(compMove: Int, userMove: Int): Int {
    val rock = intArrayOf(0,1,-1)
    val paper = intArrayOf(-1,0,1)
    val scissors = intArrayOf(1,-1,0)

    val combos = arrayOf(rock,paper,scissors)
    return combos[compMove][userMove]
}

fun runGame(): Int{
    println("Game is starting .. ")
    val compMove = compMove()
    val userMove = getUserMove()

    val cMove = when(compMove){
        0 -> "Rock"
        1 -> "Paper"
        else -> "Scissors"
    }

    val userM = when(userMove){
        0 -> "Rock"
        1 -> "Paper"
        else -> "Scissors"
    }
    println("The computer chose $cMove")
    println("You chose $userM")
    val resultOfGame = decideWinner(compMove,userMove)
    when(resultOfGame){
        0 -> println("Tie game. Better luck next time ")
        1 -> println("You win! Congrats!")
        else -> println("The Computer won, better luck next time! ")
    }
    return resultOfGame

}