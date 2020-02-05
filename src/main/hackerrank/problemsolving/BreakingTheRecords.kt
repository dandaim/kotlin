package main.hackerrank.problemsolving

import java.util.*

//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {

    var minTimes = 0
    var maxTimes = 0
    var min = scores[0]
    var max = scores[0]

    scores.forEach {
        if (it < min) {
            min = it
            minTimes++
        }

        if (it > max) {
            max = it
            maxTimes++
        }
    }

    return arrayOf(maxTimes, minTimes)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
