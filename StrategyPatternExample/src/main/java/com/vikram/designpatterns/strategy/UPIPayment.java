package com.vikram.designpatterns.strategy;

public class UPIPayment implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "upi payment: " + amount;
    }
}
