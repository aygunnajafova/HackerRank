package ProblemSolving

fun main() {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var notA = 0
    var notB = 0
    var arr : Array<Int>
    for(i in 0 .. a.lastIndex) {
        if(a[i] > b[i]) {
            notA+=1
        }
        if(a[i] < b[i]) notB++
    }
    arr = arrayOf(notA, notB)
    return arr
}
