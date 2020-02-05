package main.basics

fun printListIndexesAndElements(inputList: List<String>) {
    for ((index, element) in inputList.withIndex()) {
        println("Index: $index -> Element: $element")
    }
}