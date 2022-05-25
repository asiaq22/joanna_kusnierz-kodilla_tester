package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Skoda skoda = new Skoda(70);
        doRace(skoda);

        Citroen citroen = new Citroen(65);
        doRace(citroen);

        Ford ford = new Ford(70);
        doRace(ford);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }
}
