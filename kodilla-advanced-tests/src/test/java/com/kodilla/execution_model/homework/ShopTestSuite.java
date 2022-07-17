package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();
    Order one = new Order("John", 200, LocalDate.of(2002,6,1));
    Order two = new Order("Mark", 1300, LocalDate.of(2001,2,3));
    Order three = new Order("Tom", 150, LocalDate.of(2000,10,10));
    Order four = new Order("Peter", 370, LocalDate.of(2021,1,25));
    Order fife = new Order("George", 1000, LocalDate.of(2022,7,2));
    Order six = new Order("David", 550, LocalDate.of(2021,12,15));
    Order seven = new Order("Andrew", 640, LocalDate.of(2021,11,22));
    Order eight = new Order("Betty", 125, LocalDate.of(2020,11,25));
    Order nine = new Order("Emily", 200, LocalDate.of(2021,5,23));
    Order ten = new Order("Emma", -250, LocalDate.of(2020,4,1));


    @BeforeEach
    public void initalizeShop() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);
        shop.addOrder(four);
        shop.addOrder(fife);
        shop.addOrder(six);
        shop.addOrder(seven);
        shop.addOrder(eight);
        shop.addOrder(nine);
        shop.addOrder(ten);
    }

    @Test
    public void shouldAddItems() {
        //when
        int sum = shop.getSize();
        //then
        assertEquals(9, sum);
    }

    @Test
    public void shouldGetSumNumberOfOrders() {
        //when
        int sum = shop.getSumOrders();
        //then
        assertEquals(9, sum);
    }

    @Test
    public void shouldGetSumValues() {
        //when
        double sum = shop.getSumValues();
        //then
        assertEquals(4535, sum);
    }

    @Test
    public void shouldReturnListOfOrdersInTheRangeOfTwoYears() {
        //when
        Set<Order> result = shop.getOrdersByDate(LocalDate.of(2022,7,15));
        Set<Order> expected = new HashSet<>();
        expected.add(four);
        expected.add(fife);
        expected.add(six);
        expected.add(seven);
        expected.add(eight);
        expected.add(nine);
        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetOrdersInTheRangeOfTwoYears() {
        //when
        Set<Order> result = shop.getOrdersByDate(LocalDate.of(2000,1,1));
        Set<Order> expected = new HashSet<>();
        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnOrdersByPriceRange() {
        //when
        Set<Order> result = shop.getOrdersByPriceRange(1000, 200);
        Set<Order> expected = new HashSet<>();
        expected.add(four);
        expected.add(six);
        expected.add(seven);
        //then
        assertEquals(expected, result);
    }

    @AfterAll
    public static void afterTest() {
        System.out.println("Yaaaaay! Its working!");
    }
}