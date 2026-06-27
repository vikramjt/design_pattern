package com.vikram.designpatterns.state;

public class ShippedOrderState implements OrderState {
    @Override
    public String confirm(Order order) {
        return "already shipped";
    }

    @Override
    public String ship(Order order) {
        return "already shipped";
    }
}
