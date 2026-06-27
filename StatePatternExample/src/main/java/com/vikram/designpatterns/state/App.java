package com.vikram.designpatterns.state;

public class App {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.confirm());
        System.out.println(order.ship());
    }
}
