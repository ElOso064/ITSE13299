package week06
// Josue Barajas - Assignment 6.2 - November 3rd
fun main(){
    val answer = "My question"
    var array8BallResponses = arrayOf(
            "Yes, of course!",
            "Without a doubt, yes!",
            "You can count on it!",
            "For sure!",
            "Ask me later.",
            "I’m not sure.",
            "I can’t tell you right now. I’ll tell you after my nap. No way!",
            "I don’t think so.",
            "Without a doubt, no.",
            "The answer is clearly NO.",
    )

    var userQAnswer = "bear"
    while(true){
        println("What is your question? (or type quit to exit)")
        userQAnswer = readLine()!!
        if(!userQAnswer.equals("quit")) {
            val rnds = (0..7).random()
            println(array8BallResponses!![rnds])
        }
        else{
            break
        }
    }
}
