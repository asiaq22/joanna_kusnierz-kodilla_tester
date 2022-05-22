package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 12;
        int substractResult = calculator.substract(a, b);
        assertEquals(-7, substractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = -3;
        double squareResult = calculator.square(a);
        assertEquals(9, squareResult, 0.1);
    }
}
