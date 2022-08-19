package com.kodilla.jacoco;

public class Year {

    int year1;

    public Year(int year) {
        this.year1 = year;
    }

    public boolean isLeap() {
        if (this.year1 % 4 == 0) {
            if (this.year1 % 100 == 0) {
                return this.year1 % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
