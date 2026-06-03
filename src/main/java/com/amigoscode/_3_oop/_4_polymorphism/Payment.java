package com.amigoscode._3_oop._4_polymorphism;

public interface Payment {



    Boolean processPayment(double amount);

    String getPaymentMethod();

    default void printReceipt(double amount) {
        System.out.println(amount + "paid with " + getPaymentMethod());

    }
}


