package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));

        String exampleOrder;
        try {
            exampleOrder = warehouse.isOrderInUse("Order6");
            System.out.println("Your order: " + exampleOrder);
        } catch (OrderDoesntExistException e) {
            System.out.println("The order doesn't exist. Try again.");
        }
        finally {
            System.out.println("Thank you for using KodillaSearching.");
        }

    }
}
