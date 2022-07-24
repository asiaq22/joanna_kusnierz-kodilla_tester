package com.kodilla.spring.basic.dependency_injection;

public interface MessageService {

    default void send(String message, String receiver) {

    }
}
