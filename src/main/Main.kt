package main

fun main() {
    println(doubleMap(listOf(1,2,3,4,5,6)))
}

fun double(n: Int): Int {
    return n * 2
}

fun doubleMap(numbers: List<Int>): List<Int> {
    return numbers.map{ double(it)}
}
