package ProblemSolving

fun main() {
    val n = readLine()!!.trimEnd().toInt()
    val result = staircase(n)
}

fun staircase(n: Int) : Unit {
    var m = n
    for(i in 1..n) {
        for (j in 1..n) {
            if(j >= m) print("#")
            else print(" ")
        }
        println()
        m--
    }
}