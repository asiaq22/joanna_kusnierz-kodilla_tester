package com.kodilla.abstracts.homework;

public class AppJob {

    public static void main(String[] args) {
        Job postmanJob = new Postman();
        Person postman = new Person("Bob", 30, postmanJob);
        System.out.println(postman.firstName + " responsibilities:");
        postman.getResponsibilities();

        Job doctorJob = new Doctor();
        Person doctor = new Person("Jack", 45, doctorJob);
        System.out.println(doctor.firstName + " responsibilities:");
        doctor.getResponsibilities();

        Job teacherJob = new Teacher();
        Person teacher = new Person("Agatha", 40, teacherJob);
        System.out.println(teacher.firstName + " responsibilities:");
        teacher.getResponsibilities();

        Job secretaryJob = new Secretary();
        Person secretary = new Person("Caroline", 32, secretaryJob);
        System.out.println(secretary.firstName + " responsibilities:");
        secretary.getResponsibilities();

    }
}