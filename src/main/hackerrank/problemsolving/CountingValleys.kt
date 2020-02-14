package main.hackerrank.problemsolving

import java.util.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {

    var numberOfValleys = 0
    var altitude = 0

    s.forEach {
        if (it == 'U') {
            altitude++
        } else {
            if (altitude == 0) {
                numberOfValleys++
            }
            altitude--
        }
    }

    return numberOfValleys
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
