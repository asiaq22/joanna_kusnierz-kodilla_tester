package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square(5);
        square.area();
        square.perimeter();

        Circle circle = new Circle(7);
        circle.area();
        circle.perimeter();

        Triangle triangle = new Triangle(9,12, 15, 13);
        triangle.area();
        triangle.perimeter();
    }
}
