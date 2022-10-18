package week05
// Josue Barajas - 05.1 Assignment - October 18, 2022
    fun main() {
    println(isPrime(13))
    }

    fun isNumberDivisible(number: Int, divisor: Int): Boolean {

       var results: Boolean = false
        if(number%divisor == 0){
        results = true
        }
        return results
    }

    fun isPrime(number: Int): Boolean{
        var results: Boolean = false
        if(number <= 0)
            return false
        for(i in 2 until number)
        if(isNumberDivisible(number,i)){
            return false
        }
        return true
    }