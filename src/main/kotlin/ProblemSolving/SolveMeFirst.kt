package ProblemSolving

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n1 = sc.nextInt()
    val n2 = sc.nextInt()
    println(sum(n1, n2))
}

fun sum(num1 : Int, num2 : Int) : Int {
    val sum = num1 + num2
    return sum
}
