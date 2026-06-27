package com.vikram.designpatterns.visitor;

public class Pen implements Item {
    private final String name;
    private final int price;

    public Pen(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int price() {
        return price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
