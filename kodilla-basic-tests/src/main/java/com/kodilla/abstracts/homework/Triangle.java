package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void area() {
        int result = a * h / 2;
        System.out.println("Triangle area: " + result + ".");
    }

    @Override
    public void perimeter() {
        int result = a + b + c;
        System.out.println("Triangle perimeter: " + result + ".");
    }
}
