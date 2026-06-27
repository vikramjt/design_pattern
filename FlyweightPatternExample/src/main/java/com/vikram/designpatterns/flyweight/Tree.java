package com.vikram.designpatterns.flyweight;

public class Tree {
    private final String type;

    public Tree(String type) {
        this.type = type;
    }

    public String render(int x, int y) {
        return type + " at (" + x + "," + y + ")";
    }
}
