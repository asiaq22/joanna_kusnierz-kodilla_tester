package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Set<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = getOrders()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
        return order;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public String isOrderInUse(String number) throws OrderDoesntExistException {
        if (getOrder(number).getNumber().equals(number))
            return getOrder(number).getNumber().toString();
        throw new OrderDoesntExistException();


    }
}
