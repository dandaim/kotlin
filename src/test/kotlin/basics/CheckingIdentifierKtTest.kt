package src.test.kotlin.basics

import main.exercises.isValidIdentifier
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CheckingIdentifierKtTest {

    @Test
    fun returnTrueWhenArgumentStartsWithLetterAndHasOnlyLetters() {
        Assertions.assertTrue(isValidIdentifier("name"))
    }

    @Test
    fun returnTrueWhenArgumentStartsWithUnderscoreAndItHasOnlyValidCharacters() {
        Assertions.assertTrue(isValidIdentifier("_name"))
        Assertions.assertTrue(isValidIdentifier("_12"))
    }

    @Test
    fun returnFalseWhenArgumentIsAnEmptyString() {
        Assertions.assertFalse(isValidIdentifier(""))
    }

    @Test
    fun returnFalseWhenArgumentStartsWithADigit() {
        Assertions.assertFalse(isValidIdentifier("012"))
    }

    @Test
    fun returnFalseWhenArgumentStartsWithAValidCharacterButHasAnInvalidCharacterAfter() {
        Assertions.assertFalse(isValidIdentifier("no$"))
    }
}
