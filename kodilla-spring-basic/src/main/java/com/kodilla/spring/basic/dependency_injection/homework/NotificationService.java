package com.kodilla.spring.basic.dependency_injection.homework;

public interface NotificationService {

    default void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    default void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }

}
