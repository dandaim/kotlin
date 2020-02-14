package main.hackerrank.problemsolving

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var numOfSegments = 0
    val numOfIterations = s.size - m


    for (squareIndex in 0..numOfIterations) {
        if (s.sliceArray(squareIndex until m + squareIndex).sum() == d) {
            numOfSegments++
        }
    }

    return numOfSegments
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
