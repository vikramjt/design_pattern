package com.vikram.designpatterns.state;

public class ConfirmedOrderState implements OrderState {
    @Override
    public String confirm(Order order) {
        return "already confirmed";
    }

    @Override
    public String ship(Order order) {
        order.setState(new ShippedOrderState());
        return "order shipped";
    }
}
