package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;

public class Order {

    private String name;
    private double value;
    private LocalDate date;


    public Order(String name, double value, LocalDate date) {
        this.name = name;
        this.value = value;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }


}
