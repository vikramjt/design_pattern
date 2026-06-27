package com.vikram.designpatterns.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "card payment: " + amount;
    }
}
