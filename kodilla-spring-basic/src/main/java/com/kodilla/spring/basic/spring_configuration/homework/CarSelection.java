package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarSelection {

    @Bean
    public Car selectCar() {
        Car car;                                            // 0 - zima, 1 - lato, 3 - wiosna, jesień
        Random generator = new Random();
        int season = generator.nextInt(3);
        if (season == 0) {
            car = new SUV();
        } else if (season == 1) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }

    @Bean
    public Car headLightsOn() {
        Car car;
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(20, 0)) && time.isBefore(LocalTime.of(6, 0))) {
            selectCar().hasHeadlightsTurnedOn();
        }
        return selectCar();
    }

}
