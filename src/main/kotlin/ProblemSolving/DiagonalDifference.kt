package ProblemSolving

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sumLeft = 0
    var sumRight = 0
    for(i in 0..arr[0].lastIndex) {
        for(j in 0..arr[0].lastIndex) {
            if(i==j) {
                sumLeft+=arr[i][j]
            }
            if((i+j)==(arr.lastIndex)) {
                sumRight+=arr[i][j]
            }
        }
    }
    var result = abs(sumLeft - sumRight)
    return result

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
