package com.vikram.designpatterns.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 2;
    }

    @Override
    public String description() {
        return coffee.description() + ", sugar";
    }
}
