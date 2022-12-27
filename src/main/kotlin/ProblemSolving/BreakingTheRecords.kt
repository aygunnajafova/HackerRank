package ProblemSolving

fun main() {
    val n = readLine()!!.trimEnd().toInt()
    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    breakingTheRecords(scores)
}

fun breakingTheRecords(scores : Array<Int>) : Unit {
    var highestScore = scores[0]
    var lowestScore = scores[0]
    var bestRecord = 0
    var worstRecord = 0

    for(i in 0..scores.lastIndex) {
        if(scores[i] > highestScore) {
            highestScore = scores[i]
            bestRecord++
        }

        else if (scores[i] < lowestScore) {
            lowestScore = scores[i]
            worstRecord++
        }
    }

    println("$bestRecord $worstRecord")
}