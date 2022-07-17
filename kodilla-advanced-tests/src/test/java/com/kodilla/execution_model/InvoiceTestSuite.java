package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item tea = new Item("Tea", 4.00);
    Item coffee = new Item("Coffee", 5.50);
    Item sugar = new Item("Sugar", 2.50);
    Item milk = new Item("Sugar", 3.00);

    @Test
    public void shouldAddItems() {
        //When
        int numberOfItems = invoice.getSize();

        //Then
        assertEquals(4, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //When
        Item result = invoice.getItem(1);

        //Then
        assertEquals("Coffee", result.getName());
        assertEquals(5.50, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenIndexIsNegative() {
        //When
        Item result = invoice.getItem(-3);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenIndexISOutOfRange() {
        //When
        Item result = invoice.getItem(7);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //When
        invoice.clear();

        //Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(tea);
        invoice.addItem(coffee);
        invoice.addItem(sugar);
        invoice.addItem(milk);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}