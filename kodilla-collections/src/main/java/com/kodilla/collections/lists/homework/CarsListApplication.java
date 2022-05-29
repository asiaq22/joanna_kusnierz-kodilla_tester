package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Skoda(50));
        cars.add(new Skoda(60));
        cars.add(new Skoda(65));
        cars.add(new Ford(55));
        cars.add(new Ford(50));
        cars.add(new Citroen(45));
        Citroen citroen = new Citroen(50);
        cars.add(citroen);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        cars.remove(2);
        cars.remove(citroen);

        System.out.println("==================================");

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("==================================");
        System.out.println("Number of elements: " + cars.size());

    }
}
