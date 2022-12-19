package ProblemSolving

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

fun plusMinus(arr: Array<Int>) : Unit {
    var countN = 0.0
    var countP = 0.0
    var countZ = 0.0
    for(i in 0..arr.lastIndex) {
        if(arr[i] > 0) countP++
        else if(arr[i] < 0) countN++
        else countZ++
    }
    println(countP/arr.size)
    println(countN/arr.size)
    println(countZ/arr.size)
}