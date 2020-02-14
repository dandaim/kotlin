package main.hackerrank.problemsolving

import java.util.*

/*
 * Complete the pageCount function below.
 */
//https://www.hackerrank.com/challenges/drawing-book/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
fun pageCount(n: Int, p: Int): Int {

    val numberOfPagesEven = n % 2 == 0
    val halfPages = n / 2

    if (p == 1 || p == n || (p == (n-1) && !numberOfPagesEven)) {
        return 0
    }

    if (numberOfPagesEven) {
        return if (p > halfPages) {
            val division = (n - p) / 2
            if (division == 0) {
                1
            } else {
                division
            }
        } else {
            (p - 2) / 2 + 1
        }
    } else {
        return if (p > halfPages) {
            (n - p) / 2
        } else {
            (p - 2) / 2 + 1
        }
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
