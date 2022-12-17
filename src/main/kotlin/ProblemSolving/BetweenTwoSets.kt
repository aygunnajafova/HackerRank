package ProblemSolving

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val arr1 = arrayOfNulls<Int>(n)
    val arr2 = kotlin.arrayOfNulls<Int>(m)

    for(i in 0 until n) {
        arr1[i] = sc.nextInt()
    }

    for (i in 0 until m) {
        arr2[i] = sc.nextInt()
    }

    val total = getTotalX(arr1, arr2)

    println(total)
}

fun getTotalX(a: Array<Int?>, b: Array<Int?>): Int {
    var count = 0
    for(i in a[a.lastIndex]!!..b[0]!!) {
        var cond = true
        for(x in 0..a.lastIndex) {
            if(i% a[x]!! !=0) cond = false
        }
        for(x in 0..b.lastIndex) {
            if(b[x]!! %i!=0) cond = false
        }
        if(cond == true) count++

    }
    return count
}
