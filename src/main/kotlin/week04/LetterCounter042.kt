package week04
// Josue Barajas - 04.2 Letter Counter - 09/21/2022
fun main (){
    println("Please enter a full sentence.")
    val userSentence = readLine()
    println("Please enter a letter in the alphabet that's in your sentence.")
    val userCharacter = readLine()!!.first()
    var userCharQt = 0

        for(i in 0 .. userSentence!!.length - 1 ){
            if (userCharacter == userSentence[i]){
                userCharQt ++
            }
        }
    println("$userCharacter is in your sentence a total of $userCharQt times!")
}




