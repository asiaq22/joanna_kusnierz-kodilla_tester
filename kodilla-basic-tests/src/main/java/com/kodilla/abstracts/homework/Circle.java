package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    private int r;

    public Circle(int r){
       this.r = r;
    }
    @Override
    public void area() {
        double result = 3.14 * r * r;
        System.out.println("Circle area: " + result + ".");
    }

    @Override
    public void perimeter() {
        double result = 2 * 3.14 * r;
        System.out.println("Circle perimeter: " + result + ".");
    }
}
