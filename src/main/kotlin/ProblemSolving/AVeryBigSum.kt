package ProblemSolving

fun main() {
    var size = readLine()!!.trimEnd().toInt()
    var arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    var result = sumArr(arr)
    println(result)
}

fun sumArr(arr: Array<Int>) : Long {
    var sum : Long = 0
    for(i in 0..arr.lastIndex) {
        sum += arr[i]
    }
    return sum
}
