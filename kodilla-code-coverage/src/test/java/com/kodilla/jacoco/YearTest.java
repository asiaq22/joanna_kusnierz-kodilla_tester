package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfItIsNotDivisibleBy4and100and400() {

        //given
        Year year = new Year(1601);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(!isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy4and100() {

        //given
        Year year = new Year(1700);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(!isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleOnlyBy4() {

        //given
        Year year = new Year(1716);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
}
