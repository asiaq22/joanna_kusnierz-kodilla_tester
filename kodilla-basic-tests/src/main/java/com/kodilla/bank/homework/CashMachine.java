package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new double[0];
    }

    public void add(double transaction) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double saldo() {
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int numberOfTransactions() {
        int result = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            result += i;
        }
        return result;
    }

}
