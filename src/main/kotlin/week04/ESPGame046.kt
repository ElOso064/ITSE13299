package week04
// Josue Barajas - 04.6 Assignment - 09/21/2022
fun main(){
    val randomColor = arrayOf<String> ("red","green","blue","orange","yellow")
    var correctCount = 0
    println("The random colors are green, blue, red, orange and yellow.")
    println("You will have 10 guesses! I will display the ones that are correct")
        for (i in 1 .. 10) {
           val color =  randomColor.random()
            println("Please select a color from the colors provided above >> ")
            val userColor = readLine()
            if (userColor == color){
                println("Bingo! You guessed it right!")
                correctCount ++
            }  else {
                println("Try again, the correct color was $color")
            }
        }
}