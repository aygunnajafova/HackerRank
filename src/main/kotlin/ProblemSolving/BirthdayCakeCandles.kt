package ProblemSolving

fun main() {
    val n = readLine()!!.trimEnd().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    var result = birthdayCakeCandles(arr)
    println(result)
}

fun birthdayCakeCandles(candles: Array<Int>) : Int {
    var tallest = candles[0]
    for(i in 0..candles.lastIndex) {
        if(candles[i] > tallest) tallest=candles[i]
    }
    var count = 0
    for(i in 0..candles.lastIndex) {
        if(candles[i] == tallest) count++
    }
    return count
}