package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(0, cashMachines.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(-500);
        cashMachine1.add(1200);
        cashMachine1.add(-700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(-100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(150);
        cashMachine3.add(-200);
        cashMachine3.add(1600);
        cashMachine3.add(1400);
        cashMachine3.add(-300);
        cashMachine3.add(2000);
        bank.add(cashMachine3);


        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(3, cashMachines.length);
        assertEquals(cashMachine1, cashMachines[0]);
        assertEquals(cashMachine2, cashMachines[1]);
        assertEquals(cashMachine3, cashMachines[2]);
    }

    @Test
    public void shouldCalculateSaldo() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(-500);
        cashMachine1.add(1200);
        cashMachine1.add(-700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(-100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(150);
        cashMachine3.add(-200);
        cashMachine3.add(1600);
        cashMachine3.add(1400);
        cashMachine3.add(-300);
        cashMachine3.add(2000);
        bank.add(cashMachine3);

        assertEquals(10100, bank.saldo());
    }

    @Test
    public void shouldCalculateNumberOfPayouts() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(-500);
        cashMachine1.add(1200);
        cashMachine1.add(-700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(-100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(150);
        cashMachine3.add(-200);
        cashMachine3.add(1600);
        cashMachine3.add(1400);
        cashMachine3.add(-300);
        cashMachine3.add(2000);
        bank.add(cashMachine3);

        assertEquals(5, bank.numberOfPayouts());
    }

    @Test
    public void shouldCalculateNumberOfPayments() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(-500);
        cashMachine1.add(1200);
        cashMachine1.add(-700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(-100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(150);
        cashMachine3.add(-200);
        cashMachine3.add(1600);
        cashMachine3.add(1400);
        cashMachine3.add(-300);
        cashMachine3.add(2000);
        bank.add(cashMachine3);

        assertEquals(8, bank.numberOfPayments());
    }

    @Test
    public void shouldCalculateAverageOfPayouts() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(-500);
        cashMachine1.add(1200);
        cashMachine1.add(-700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(-100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(150);
        cashMachine3.add(-200);
        cashMachine3.add(1600);
        cashMachine3.add(1400);
        cashMachine3.add(-300);
        cashMachine3.add(2000);
        bank.add(cashMachine3);

        assertEquals(-360, bank.averagePayouts());
    }

    @Test
    public void shouldCalculateAveragePayments() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(-500);
        cashMachine1.add(1200);
        cashMachine1.add(-700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(-100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.add(150);
        cashMachine3.add(-200);
        cashMachine3.add(1600);
        cashMachine3.add(1400);
        cashMachine3.add(-300);
        cashMachine3.add(2000);
        bank.add(cashMachine3);

        assertEquals(1487.5, bank.averagePayments());
    }

    @Test
    public void averageOfPayoutsShouldBeZeroIfThereAreNoPayouts() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(0, bank.averagePayouts());
    }

    @Test
    public void averageOfPaymentsShouldBeZeroIfThereAreNoPayments() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(0, bank.averagePayments());
    }

    @Test
    public void noCashMachines() {
        Bank bank = new Bank();
        assertEquals(0, bank.numberOfPayouts());
        assertEquals(0, bank.averagePayments());
    }

    @Test
    public void numberOfPayoutsShouldBeZeroIfThereAreOnlyPayments() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(2000);
        cashMachine1.add(500);
        cashMachine1.add(1200);
        cashMachine1.add(700);
        bank.add(cashMachine1);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(50);
        cashMachine2.add(100);
        cashMachine2.add(3500);
        bank.add(cashMachine2);

        assertEquals(0, bank.numberOfPayouts());
    }

}
