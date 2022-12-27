package ProblemSolving

fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")
    val s = first_multiple_input[0].toInt()
    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")
    val a = second_multiple_input[0].toInt()
    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")
    val m = third_multiple_input[0].toInt()
    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)

}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) : Unit {
    var countA = 0
    var countO = 0

    for(i in 0..apples.lastIndex) {
        apples[i] += a
        if(apples[i] >= s && apples[i] <= t) countA++
    }

    for(i in 0..oranges.lastIndex) {
        oranges[i] += b
        if(oranges[i] >= s && oranges[i] <= t) countO++
    }

    println(countA)
    println(countO)
}

