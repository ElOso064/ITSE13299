fun main() {
    // PSEUDOCODE Ask user to input 3 Names and their running time
    println("Please enter 1st runner Name >> ")
    var firstRunnerName = readLine()
    println("Please enter 2nd runners Name >> ")
    var secondRunnerName = readLine()
    println("Please enter 3rd runners Name >> ")
    var thirdRunnerName = readLine()
    println("Please enter 1st runners time in full minutes >> ")
    var firstRunnerTime = Integer.valueOf((readLine()))
    println("Please enter 2nd runners time in full minutes >> ")
    var secondRunnerTime = Integer.valueOf((readLine()))
    println("Please enter 3rd runners time in full minutes >> ")
    var thirdRunnerTime = Integer.valueOf((readLine()))

    // PSEUDOCODE Create conditional if statements to put the runnners times in order.
    if (firstRunnerTime > secondRunnerTime){
        val holderTime = firstRunnerTime
        firstRunnerTime = secondRunnerTime
        secondRunnerTime = holderTime
        val holderName = firstRunnerName
        firstRunnerName = secondRunnerName
        secondRunnerName = holderName
    }
    if (secondRunnerTime > thirdRunnerTime){
      val holderTime = secondRunnerTime
      secondRunnerTime = thirdRunnerTime
      secondRunnerTime = holderTime
        val holderName = secondRunnerName
        secondRunnerName = thirdRunnerName
        secondRunnerName = holderName
    }
    if (firstRunnerTime > secondRunnerTime){
        val holderTime = firstRunnerTime
        firstRunnerTime = secondRunnerTime
        secondRunnerTime = holderTime
        val holderName = firstRunnerName
        firstRunnerName = secondRunnerName
        secondRunnerName = holderName

    }
    // PSEDUOCODE display the runners time in order.
    println("$firstRunnerName finished first with $firstRunnerTime minutes!")
    println("$secondRunnerName finished second with $secondRunnerTime minutes.")
    println("$thirdRunnerName finished last with $thirdRunnerTime minutes.")
}

