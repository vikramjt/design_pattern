package com.vikram.designpatterns.strategy;

public class Checkout {
    private final PaymentStrategy strategy;

    public Checkout(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public String pay(int amount) {
        return strategy.pay(amount);
    }
}
