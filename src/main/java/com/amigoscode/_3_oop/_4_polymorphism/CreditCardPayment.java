package com.amigoscode._3_oop._4_polymorphism;

public class CreditCardPayment implements Payment {

    // TODO: 2 - Create a CreditCardPayment class that implements Payment.
//   - Add a private field: cardNumber (String)
//   - Create a constructor that takes the cardNumber
//   - Implement processPayment() to print:
//     "Processing credit card payment of $<amount> with card <cardNumber>"
//     and return true
//   - Implement getPaymentMethod() to return "Credit Card"


    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    @Override
    public String getPaymentMethod() {
        return "CreditCard";
    }

    @Override
    public Boolean processPayment(double amount) {
        System.out.println("processing credit card payment of amount " + amount + " with " + cardNumber);
        return true;
    }
}
