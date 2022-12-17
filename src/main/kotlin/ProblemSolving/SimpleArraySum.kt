package ProblemSolving

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var arr = arrayOfNulls<Int>(n)
    for(i in 0 until n) {
        arr[i] = sc.nextInt()
    }
    var result = sum(arr)
    println(result)
}

fun sum(arr: Array<Int?>) : Int {
    var sum = 0
    for(i in arr) {
        if (i != null) {
            sum += i
        }
    }
    return sum
}
