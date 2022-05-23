package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        double[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddFifeElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2000);
        cashMachine.add(-500);
        cashMachine.add(1200);
        cashMachine.add(-700);
        cashMachine.add(650.50);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(5, transactions.length);
        assertEquals(2000, transactions[0]);
        assertEquals(-500, transactions[1]);
        assertEquals(1200, transactions[2]);
        assertEquals(-700, transactions[3]);
        assertEquals(650.50, transactions[4]);
    }

    @Test
    public void shouldCalculateSaldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2000);
        cashMachine.add(-500);
        cashMachine.add(250.50);

        assertEquals(1750.50, cashMachine.saldo());
    }

    @Test
    public void shouldCalculateNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(100);
        cashMachine.add(100);

        assertEquals(3, cashMachine.numberOfTransactions());
    }
}
