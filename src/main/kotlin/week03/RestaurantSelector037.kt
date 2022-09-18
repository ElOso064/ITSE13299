package week03

// Josue Barajas - 03.7 Restaurant Selector - Sept 17th 2022
fun main(){

    println("Is anyone in your party vegetarian? y/n ")
     val vegetarian = readLine()!!
     if (vegetarian == "y" || vegetarian == "n")
     {
         println("Is anyone in your party vegan? y/n ")
         val vegan = readLine()!!
            if(vegan == "y" || vegan == "n")
            {
                println("Is anyone in your party gluten free? y/n")
                val glutenFree = readLine()!!
                    if(glutenFree == "y" || glutenFree == "n")
                    {
                        println("Here are your restaurant choices! ")
                        println("\n")

                        if(vegetarian.equals("y"))
                        {
                            if (vegan.equals("y"))
                            {
                                if (glutenFree.equals("y") || (glutenFree.equals("n")))
                                    {
                                        println("     Corner Cafe")
                                        println("     The Chef's Kitchen")
                                    }
                                else {
                                    if (glutenFree.equals("y")) {
                                        println("    Main Street Pizza Company")
                                        println("    Corner Cafe")
                                        println("    The Chef's Kitchen")
                                    } else {
                                        println("       Main Street Pizza Company")
                                        println("       Corner Cafe")
                                        println("       Mama's Fine Italian")
                                        println("       The Chef's Kitchen")
                                    }
                                }
                            }
                            else
                            {
                                if (vegan.equals("y")) {
                                    if (glutenFree.equals("y") || (glutenFree.equals(("n"))))
                                    {
                                        println("     Corner Cafe ")
                                        println("     The Chef's Kitchen")
                                    }
                                }
                                else {
                                    if (glutenFree.equals("y")) {
                                        println("    Main Street Pizza Company")
                                        println("    Corner Cafe")
                                        println("    The Chef's Kitchen")
                                    } else {
                                        println("   Joe's Gourmet Burgers")
                                        println("   Main Street Pizza Company")
                                        println("   Corner Cafe")
                                        println("   Mama's Fine Italian")
                                        println("   The Chef's Kitchen")
                                    }
                                }
                            }
                        }
                        else
                        {
                            println("\n Error. y for yes or n for no must be chosen.\n")
                            println("Re run the program and try again.")
                    }
                    }
                else
                    {
                        println("Error. y for yes or n for no must be chosen.\n")
                        println("Re run the program and try again.")
                    }
                    }
            else
            {
                println("Error. y for yes or n for no must be chosen.\n")
                println("Re run the program and try again.")
            }
     }
}










