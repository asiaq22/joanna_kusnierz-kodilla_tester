package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String sendingPackage = bean.sendPackage("Katowice", 25);
        Assertions.assertEquals("Package delivered to: Katowice", sendingPackage);
    }

    @Test
    public void shouldNotSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String notSendPackage = bean.sendPackage("Gdansk", 45);
        Assertions.assertEquals("Package not delivered to: Gdansk", notSendPackage);
    }


    @Test
    public void shouldReturnNotificationSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String notification = bean.success("Warszawa");
        Assertions.assertEquals("Package delivered to: Warszawa", notification);
    }

    @Test
    public void shouldReturnNotificationsFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String notification = bean.fail("Szczecin");
        Assertions.assertEquals("Package not delivered to: Szczecin", notification);
    }
}