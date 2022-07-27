package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void shouldReturnResultOfAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double sum = bean.add(15,5);
        assertEquals(20,sum,0.1);
    }

    @Test
    public void shouldReturnResultOfSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double subtract = bean.subtract(14, 25);
        assertEquals(-11,subtract,0.1);
    }

    @Test
    public void shouldReturnResultOfMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double multiply = bean.multiply(5,6);
        assertEquals(30,multiply,0.1);
    }

    @Test
    public void shouldReturnResultOfDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double divide = bean.divide(25,3);
        assertEquals(8.3,divide,0.1);
    }

}