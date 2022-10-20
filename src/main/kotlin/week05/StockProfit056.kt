package week05
// Josue Barajas - 05.6 Assignment - Oct 20, 2022
fun main(){
    println("Please enter the amount of shares >> ")
    var userShares = readLine()!!.toDouble()
    println("Please enter the purchase price per share >> ")
    var purchPrice = readLine()!!.toDouble()
    println("Please enter the purchase commission paid >> ")
    var purchCom = readLine()!!.toDouble()
    println("Please enter the Sales price per share >> ")
    var salePricePrShr = readLine()!!.toDouble()
    println("Please enter the sale commission paid >> ")
    var saleCom = readLine()!!.toDouble()
    println("The profit or loss is $ ${ProfitOrLoss(userShares,purchPrice,purchCom,salePricePrShr,saleCom)}")

}

fun ProfitOrLoss(uShares: Double, prchPrice: Double, prchCom: Double, slPrPerShr: Double, slCom: Double): Double{
    var conversion = ((uShares*slPrPerShr)-slCom) - ((uShares*prchPrice) + prchCom)
    return conversion
}