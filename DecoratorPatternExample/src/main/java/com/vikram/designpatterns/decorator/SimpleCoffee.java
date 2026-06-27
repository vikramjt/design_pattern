package com.vikram.designpatterns.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "coffee";
    }
}
