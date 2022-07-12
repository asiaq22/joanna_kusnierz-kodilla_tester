package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTheTestBMI() {
        return Stream.of(
                Arguments.of("Normal (healthy weight)", new Person(1.70, 65.00)),   //22.49
                Arguments.of("Overweight", new Person(1.62, 70.50)),   //26.90
                Arguments.of("Overweight", new Person(1.55, 65.50)),   //27.29
                Arguments.of("Obese Class II (Severely obese)", new Person(1.75, 120.00)),  //39.21
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.73, 101.00)),  //33.77
                Arguments.of("Underweight", new Person(1.72, 50.00)),   //16.94
                Arguments.of("Normal (healthy weight)", new Person(2.02, 80.00)),   //19.60
                Arguments.of("Normal (healthy weight)", new Person(1.88, 88.00)),   //24.92
                Arguments.of("Obese Class V (Super Obese)", new Person(1.70, 158.00))   //54.67
        );
    }

    static Stream<Arguments> heightIsZero() {
        return Stream.of(
                Arguments.of(new Person(0.00,0.00))
        );
    }

    static Stream<Arguments> negativeHeightOrWeight() {
        return Stream.of(
                Arguments.of(new Person(-1.70, 65.00)),  //22.49
                Arguments.of(new Person(1.75, -70.00))  //-22.87
        );
    }
}
