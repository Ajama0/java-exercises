package com.amigoscode._3_oop._4_polymorphism;

import java.util.List;

public class PaymentProcessor {

    void processAllPayments(List<Payment> payments, double amount) {
        for (Payment payment : payments) {
            payment.processPayment(amount);
            payment.printReceipt(amount);
            System.out.println();

        }
    }
}
