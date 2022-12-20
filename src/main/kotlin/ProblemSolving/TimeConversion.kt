package ProblemSolving

fun main() {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}

fun timeConversion(time: String) : String {
    var a: String = time
    var hour = time.take(2).toInt()

    //To convert time:
    if(a[8] == 'A') {
        if(hour == 12) {
            a = a.replace(a.take(2),"00")
        }
    } else {
        if(hour != 12) {
            hour += 12
            a = a.replace(a.take(2), hour.toString())
        }
    }

    //To cut AM and PM:
    for(i in 0..a.lastIndex) {
        if(a[i].isDigit() || a[i] == ':') {
            continue
        } else {
            a = a.replace(a[i],' ')
        }
    }

    a = a.trimEnd()

    return a
}