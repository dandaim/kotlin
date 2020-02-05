package main.exercises

var number = 1
val foo: Int
    get() = number++

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}