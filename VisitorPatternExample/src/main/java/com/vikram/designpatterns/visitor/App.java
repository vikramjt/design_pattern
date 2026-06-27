package com.vikram.designpatterns.visitor;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Book("LLD", 500));
        cart.add(new Pen("Marker", 20));
        System.out.println(cart.accept(new PriceVisitor()));
    }
}
