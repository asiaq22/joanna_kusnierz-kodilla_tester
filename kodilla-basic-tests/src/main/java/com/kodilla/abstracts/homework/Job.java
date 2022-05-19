package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;

    private String responsibilities;

    public Job(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void getResponsibilities() {
        String result = responsibilities;
        System.out.println(result);
    }
}
