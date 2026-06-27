package com.vikram.designpatterns.strategy;

public class App {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new CardPayment());
        System.out.println(checkout.pay(250));
    }
}
