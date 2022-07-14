package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideDataForTheTestBMI")
    public void shouldCalcucalteBMI(String expected, Person person) throws InvalidPersonException {
        assertEquals(expected, person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#heightIsZero")
    public void shouldReturnExceptionForDivisionByZero(Person person) throws InvalidPersonException {
        Assertions.assertThrows(InvalidPersonException.class, () -> person.getBMI());
    }


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#negativeHeightOrWeight")
    public void shouldReturnExceptionForNegativeHeightOrWeight(Person person) throws InvalidPersonException {
        Assertions.assertThrows(InvalidPersonException.class, () -> person.getBMI());
    }
}