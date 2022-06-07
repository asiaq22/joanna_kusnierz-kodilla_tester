package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {
        List<Flight> result = FlightFinder.findFlightsFrom("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Berlin"));
        expectedList.add(new Flight("Warsaw", "Paris"));
        expectedList.add(new Flight("Warsaw", "Madrid"));

        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightTo() {
        List<Flight> result = FlightFinder.findFlightsTo("Madrid");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Madrid"));
        expectedList.add(new Flight("London", "Madrid"));

        assertEquals(expectedList, result);
    }

    @Test
    public void findFlightFromCityThatIsNotOnTheList() {
        List<Flight> result = FlightFinder.findFlightsFrom("Madrid");
        List<Flight> expectedList = new ArrayList<>();

        assertEquals(expectedList, result);

    }
}