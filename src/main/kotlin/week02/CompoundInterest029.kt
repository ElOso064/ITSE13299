package week02
import kotlin.math.pow

import java.util.Scanner
// Josue Barajas - 02.9 - Sept 15 2022
fun main (){
    println("Please enter the amount of money originally deposited into the account. >>")
    val moneyDeposited = Integer.valueOf(readLine())
    println("What is the amount of interest paid by the account? Only enter whole numbers!")
    val annualInterestRate = Integer.valueOf(readLine())
    val doubleInterestRate = annualInterestRate.toDouble()
    println("How many times per year is the interested compounded?")
    val numberOfTimesIntComp = Integer.valueOf(readLine())
    println("How many years will the account be left to earn interest?")
    val yearsLeftInt = Integer.valueOf(readLine())
    val base = ((moneyDeposited*(1+(doubleInterestRate/100)/numberOfTimesIntComp)))
    val exponent = numberOfTimesIntComp*yearsLeftInt
    val totalAmount = base.pow(exponent)

    println("The final amount in your account is $totalAmount")
}