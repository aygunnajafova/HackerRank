package ProblemSolving

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))

}

fun gradingStudents(arr: Array<Int>) : Array<Int> {
    var grade: Int
    for(i in 0..arr.lastIndex) {
        if(arr[i]%5 >= 3 && arr[i] > 37) {
            arr[i] = 5*(arr[i]/5+1)
        }
    }

    return arr
}