package week06
// Josue Barajas - 06.1 Assignment
fun main(){
    print("Raven: Hello stranger! What is your name? ")
    val player: String? = readLine()

    println("Raven: $player, you are in great danger! You have crossed enemy lines and now you must find your way out without any one seeing you! " )
    println("Be careful and try  not to get caught, good luck!")
    do {
        print("Would you like to start exploring? >> ")
        var response: String? = readLine()
        if (response == "no") {
            println("Raven: Alright then, type 'quit' >> ") }
        else if (response == "yes"){
            println("There is a dark forest to your left.")
            println("There is a river to your right.")
            println("There is a brick wall in front of you!")
            println("Where do you want to go? Options are: left, right ")
            var response2 = readLine()
            if (response2 == "left") {
                println("You see a villager, do you approach? Type: yes or no")
                var response3 = readLine()
                if (response3 == "yes") {
                    print("It was an enemy in disguise! You lost :(")
                    break
                } else if (response3 == "no") {
                    println("You sneak past the villager and you see a car. ")
                    println("Do you want to drive it? ")
                    var response4 = readLine()
                    if (response4 == "no") {
                        print("An enemy snuck up behind you and captured you! ")
                        break
                    } else if (response4 == "yes") {
                        println("You drive through the forest without getting caught \n You get to the highway and you see 2 roads")
                        println("Do you want to drive towards the city or the farm? Type: farm or city ")
                        var response5 = readLine()
                        if (response5 == "farm") {
                            println("The road is empty...")
                            println("The enemies saw you and you got captured!")
                            break
                        } else if (response5 == "city") {
                            println("You start driving and you see traffic!")
                            println("You are able to escape since the enemies can't spot you!")
                            println("Congratulations $player! You win!")
                            break
                        }
                    }
                }
            }
            else if (response2 == "right") {
                println("You go towards the river but see that there is no bridge to cross! ")
                println("You can either swim or build a raft from planks on the ground \n Type: swim or raft")
                var response6 = readLine()
                if (response6 == "swim") {
                    println("You got caught in the river current! You drowned :(")
                    break
                } else if (response6 == "raft")
                    println("Luckily you have a rope with you. \n You can make your raft with bamboo or logs: \n Type bamboo or logs")
                var response7 = readLine()
                if (response7 == "bamboo") {
                    println("Great choice! You made it through the river and were able to escape! You win!")
                    break
                } else if (response7 == "logs") {
                    print("The logs were too heavy! Your raft flipped over and you drowned! ")
                    break
                }
            }
        }
    }
    while (response != "quit")
}
