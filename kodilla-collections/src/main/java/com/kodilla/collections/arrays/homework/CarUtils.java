package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("------------------------");
        System.out.println("Car: " + getCarName(car));
        System.out.println("Speed: " + car.getSpeed());


    }

    private static String getCarName(Car car) {
        if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Citroen)
            return "Citroen";
        else
            return "Unknown car name";

    }
}
