package ProblemSolving

fun main() {
    val n = readLine()!!.trimEnd().toInt()
    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val input =  readLine()!!.trimEnd().split(" ")
    val d = input[0].toInt()
    val m = input[1].toInt()

    val result = subarrayDivision(s, d, m)
    println(result)
}

fun subarrayDivision(s: Array<Int>, d: Int, m: Int) : Int {
    var count = 0


    for(i in 0 .. s.lastIndex) {
        var sum = 0
        var lIndex = i+m
        if(lIndex > s.lastIndex) lIndex = s.lastIndex + 1
        for(j in i until lIndex) {
            sum += s[j]
        }
        if(sum == d) count++
    }

    return count
}