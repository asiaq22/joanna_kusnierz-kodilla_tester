package com.kodilla.collections.interfaces.homework;

public class Citroen implements Car {

    private int speed;

    public Citroen(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = speed + 20;
    }

    public void decreaseSpeed() {
        speed = speed - 15;
    }

}
