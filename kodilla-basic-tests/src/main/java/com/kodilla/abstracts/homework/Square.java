package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private int a;

    public Square(int a){
       this.a = a;
    }
    @Override
    public void area() {
        int result = a * a;
        System.out.println("Square area: " + result + ".");
    }

    @Override
    public void perimeter() {
        int result = 4 * a;
        System.out.println("Square perimeter: " + result + ".");
    }
}
