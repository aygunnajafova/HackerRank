package ProblemSolving

fun main() {
    val input = readLine()!!.trimEnd().split(" ")
    var x1 = input[0].toInt()
    var v1 = input[1].toInt()
    var x2 = input[2].toInt()
    var v2 = input[3].toInt()

    val state = numberLineJumps(x1, v1, x2, v2)
    println(state)
}

fun numberLineJumps(x1: Int, v1: Int, x2: Int, v2: Int) : String {
    var state = "YES"
    if((x1 >= x2 && v1 > v2) || (x1 <= x2 && v1 < v2) || (v1 == v2 && x1!=x2)) state = "NO"

    if(x1 != x2 && v1 != v2 && (x2 - x1) % (v2 - v1) != 0) state = "NO"

    return state
}