package com.vikram.designpatterns.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 5;
    }

    @Override
    public String description() {
        return coffee.description() + ", milk";
    }
}
