package main.hackerrank.problemsolving

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

//https://www.hackerrank.com/challenges/grading/problem

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val minimumGrade = 38

    return grades.map { grade ->
        if (grade >= minimumGrade && grade % 5 !in 0..2) {

            grade + (5 - grade % 5)
        } else {
            grade
        }
    }.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
