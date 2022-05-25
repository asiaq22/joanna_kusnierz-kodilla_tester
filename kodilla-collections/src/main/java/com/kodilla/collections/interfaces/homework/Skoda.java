package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {

    private int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = speed + 20;
    }

    public void decreaseSpeed() {
        speed = speed -10;
    }

}
