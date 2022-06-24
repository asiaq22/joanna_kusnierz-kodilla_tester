package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {".", "a", "Jo", "-P"})
    public void shouldReturnFalseIfNameIsShorterThanThreeChars(String text) {
        assertFalse(validator.validateUsername(text));
    }
    @ParameterizedTest
    @ValueSource(strings = {"-+abcd", "!hDs2", "ju%JuU", "12*34", "DDD&D", "po;PP", "#test", "tost^"})
    public void shouldReturnfalseIfNameContainsInvalidChars(String text) {
        assertFalse(validator.validateUsername(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String text){
        assertFalse(validator.validateUsername(text));
    }


//  validateEmail dopuszcza przed @: cyfry, duże małe litery, myślnik, kropkę ale musi coś po niej być
//                             po @: cyfry, duże małe litery, myślnik
//                           musi być kropka
//                             po . : od 1 do 6 liter dużych albo małych

    @ParameterizedTest
    @ValueSource(strings = {"123", ".a@al.pl", "12Yb-.@ja.jo", "ab!a@ja.jk", "&%test@te.st", "jo@a.abababb", "jo@1234abc.ABC%", "@te.st"})
    public void shouldReturnFalseIfEmailContainsInvalidChars(String text) {
        assertFalse(validator.validateEmail(text));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty(String text) {
        assertTrue(validator.validateEmail(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String text) {
        assertFalse(validator.validateEmail(text));
    }

}