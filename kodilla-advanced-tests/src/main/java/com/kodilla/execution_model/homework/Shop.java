package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();
    

    public void addOrder(Order order) {
        if (order.getValue() > 0)
        this.orders.add(order);
    }

    public int getSumOrders() {
        return (int) this.orders
                .stream()
                .count();
    }

    public double getSumValues() {
        return this.orders
                .stream()
                .mapToDouble(Order::getValue).sum();
    }

    public Set<Order> getOrdersByPriceRange(double high, double low) {
        return this.orders
                .stream()
                .filter(order -> order.getValue() < high && order.getValue() > low)
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersByDate(LocalDate givenDate) {
        LocalDate twoYearsAgo = givenDate.minusYears(2);
        return this.orders
                .stream()
                .filter(order -> order.getDate().isAfter(twoYearsAgo) && order.getDate().isBefore(givenDate))
                .collect(Collectors.toSet());

    }

//    public Set<Order> getOrdersByDateFirstVersion(LocalDate from, LocalDate to) {
//        return this.orders
//                .stream()
//                .filter(order -> order.getDate().isAfter(from) && order.getDate().isBefore(to))
//                .collect(Collectors.toSet());
//    }


    public int getSize() {
        return this.orders.size();
    }
}
