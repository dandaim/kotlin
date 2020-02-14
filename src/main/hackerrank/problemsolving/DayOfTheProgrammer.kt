package main.hackerrank.problemsolving

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {

    if (year.isLeapJulian() || year.isLeapGregorian()) {
        return "12.09.$year"
    } else if (year.isRegularJulian() || year.isRegularGregorian()) {
        return "13.09.$year"
    }

    return "26.09.$year"
}

fun Int.isRegularGregorian(): Boolean {
    return this > 1918 && !(this % 400 == 0 || (this % 4 == 0 && this % 100 != 0))
}

fun Int.isLeapGregorian(): Boolean {
    return this > 1918 && (this % 400 == 0 || (this % 4 == 0 && this % 100 != 0))
}

fun Int.isRegularJulian(): Boolean {
    return this in 1700..1917 && this % 4 != 0
}

fun Int.isLeapJulian(): Boolean {
    return this in 1700..1917 && this % 4 == 0
}


fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
