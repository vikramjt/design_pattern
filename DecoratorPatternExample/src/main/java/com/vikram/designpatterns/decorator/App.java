package com.vikram.designpatterns.decorator;

public class App {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println(coffee.cost() + " - " + coffee.description());
    }
}
