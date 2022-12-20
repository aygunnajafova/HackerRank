package ProblemSolving

fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}

fun miniMaxSum(arr: Array<Int>) : Unit {
    var sum : Long = 0
    var min = arr[0]
    var max = arr[0]

    for(i in 0..arr.lastIndex) {
        sum += arr[i]
        if(arr[i] < min) min = arr[i]
        if(arr[i] > max) max = arr[i]
    }
    val minSum = sum-max
    val maxSum = sum-min
    println("$minSum $maxSum")
}