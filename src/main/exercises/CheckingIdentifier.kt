package main.exercises

/*
Implement the function that checks whether a string is a valid identifier.
A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
digits and underscores.
 */

fun isValidIdentifier(string: String): Boolean {
    val regex = Regex("""(_|[a-zA-Z])(\w|\d)*""")
    return regex.matches(string)
}
