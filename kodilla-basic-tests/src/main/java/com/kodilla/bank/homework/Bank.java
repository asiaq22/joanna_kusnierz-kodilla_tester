package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public double saldo() {
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].saldo();
        }
        return sum;
    }

    public int numberOfPayouts() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].getTransactions().length; j++) {
                if (cashMachines[i].getTransactions()[j] < 0)
                    count++;
            }
        }
        return count;
    }

    public double averagePayouts() {
        if (this.cashMachines.length == 0 || numberOfPayouts() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].getTransactions().length; j++) {
                if (cashMachines[i].getTransactions()[j] < 0)
                    sum += cashMachines[i].getTransactions()[j];
            }
        }
        return sum / numberOfPayouts();
    }

    public int numberOfPayments() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].getTransactions().length; j++) {
                if (cashMachines[i].getTransactions()[j] > 0)
                    count++;
            }
        }
        return count;
    }

    public double averagePayments() {
        if (this.cashMachines.length == 0 || numberOfPayments() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            for (int j = 0; j < this.cashMachines[i].getTransactions().length; j++) {
                if (cashMachines[i].getTransactions()[j] > 0)
                    sum += cashMachines[i].getTransactions()[j];
            }
        }
        return sum / numberOfPayments();
    }

}
