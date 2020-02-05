package main.hackerrank.problemsolving

import java.math.BigInteger
import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {

    val bigValues = arr.map { it.toBigInteger() }

    val sum = bigValues.reduce { sum, value -> sum.plus(value) }

    val maxSum = sum.minus(BigInteger.valueOf(arr.min()!!.toLong()))
    val minSum = sum.minus(BigInteger.valueOf(arr.max()!!.toLong()))

    print("$minSum $maxSum")
}

fun main(args: Array<String>) {
    println(Int.MAX_VALUE)
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
// 256741038 623958417 467905213 714532089 938071625