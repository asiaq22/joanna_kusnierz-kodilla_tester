package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int substractResult = calculator.substract(a, b);
        int squareResult = calculator.square(a);
        boolean correct1 = ResultChecker.assertEquals(13, sumResult, 0);
        if (correct1) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean correct2 = ResultChecker.assertEquals(-3, substractResult, 0);
        if (correct2) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean correct3 = ResultChecker.assertEquals(25, squareResult, 0.1);
        if (correct3) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }

}
