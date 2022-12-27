package ProblemSolving

fun main() {
    val input = readLine()!!.trimEnd().split(" ")
    val n = input[0].toInt()
    val k = input[1].toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = divisibleSumParis(n, k, arr)
    println(result)

}

fun divisibleSumParis(n: Int, k: Int, arr: Array<Int>) : Int {
    var count = 0

    for(i in 0 until arr.lastIndex) {
        for(j in i+1..arr.lastIndex) {
            if( i < j && (arr[i] + arr[j]) % k == 0) count++
        }
    }

    return count
}