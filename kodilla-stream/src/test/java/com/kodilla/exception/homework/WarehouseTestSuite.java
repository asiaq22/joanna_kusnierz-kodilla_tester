package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        //when
        String exampleOrder = warehouse.isOrderInUse("Order1");
        //then
        assertEquals("Order1", exampleOrder);
    }

    @Test
    public void testIsOrderInUse_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.isOrderInUse("Order5"));
    }
}