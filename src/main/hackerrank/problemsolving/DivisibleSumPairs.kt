package main.hackerrank.problemsolving

import java.util.*

//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var count = 0

    for (i in ar.indices) {
        for (j in i + 1 until ar.size) {
            if ((ar[i] + ar[j]) % k == 0) {
                count++
            }
        }
    }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
