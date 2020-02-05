package main.hackerrank.problemsolving

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {

    var positives: Double = 0.0
    var negatives: Double = 0.0
    var zeros: Double = 0.0

    arr.forEach {
        when {
            it > 0 -> positives++
            it == 0 -> zeros++
            it < 0 -> negatives++
        }
    }

    println( BigDecimal(positives / arr.size).setScale(6, RoundingMode.HALF_UP) )
    println(BigDecimal(negatives / arr.size).setScale(6, RoundingMode.HALF_UP))
    println(BigDecimal(zeros / arr.size).setScale(6, RoundingMode.HALF_UP))
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
