package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarSelectionTestSuite {

    @Test
    public void shouldSelectCar () {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.");
        Car car = (Car) context.getBean("selectCar");
        //when
        String carName = car.getCarType();
        //then
        List<String> possibleCars = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCars.contains(carName));
    }

    @Test
    public void shouldMakeLightsBeanAndSelectCar () {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.");
        Car car = (Car) context.getBean("headLightsOn");
        //when
        boolean lightsTurnedOn = car.hasHeadlightsTurnedOn();
        //then
        Assertions.assertTrue(lightsTurnedOn);
    }
}