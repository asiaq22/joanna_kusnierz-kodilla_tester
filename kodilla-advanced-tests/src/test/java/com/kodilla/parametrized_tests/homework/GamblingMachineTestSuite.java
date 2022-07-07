package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;


class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    private Set<Integer> loadNumbersFromFile(String testNumbers) {
        String[] numAsString = testNumbers.split(";");

        Set<String> setOfStringNumbers = new HashSet<>();
        for (String number : numAsString) {
            setOfStringNumbers.add(number);
        }

        Set<Integer> testNumb = new HashSet<>();
        setOfStringNumbers.stream()
                .mapToInt(Integer::parseInt)
                .forEach(testNumb::add);

        return testNumb;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gambMachineTooHighValues.csv")
    public void shouldReturnExceptionForTooHighValues(String testNumbers) throws InvalidNumbersException {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = loadNumbersFromFile(testNumbers);
            int control = gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gambMachineTooMuchValues.csv")
    public void shouldReturnExceptionForTooMuchValues(String testNumbers) throws InvalidNumbersException {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = loadNumbersFromFile(testNumbers);
            int control = gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gambMachineTooLittleValues.csv")
    public void shouldReturnExceptionForTooLittleValues(String testNumbers) throws InvalidNumbersException {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = loadNumbersFromFile(testNumbers);
            int control = gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gambMachineZeroAndNegativeValues.csv")
    public void shouldReturnExceptionForZeroAndNegativeValues(String testNumbers) throws InvalidNumbersException {
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            Set<Integer> numbers = loadNumbersFromFile(testNumbers);
            int control = gamblingMachine.howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gambMachineCorrectValues.csv")
    public void shouldPass(String testNumbers) throws InvalidNumbersException {

        Set<Integer> numbers = loadNumbersFromFile(testNumbers);
        int control = gamblingMachine.howManyWins(numbers);

    }
}