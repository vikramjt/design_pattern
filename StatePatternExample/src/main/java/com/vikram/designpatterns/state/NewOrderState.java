package com.vikram.designpatterns.state;

public class NewOrderState implements OrderState {
    @Override
    public String confirm(Order order) {
        order.setState(new ConfirmedOrderState());
        return "order confirmed";
    }

    @Override
    public String ship(Order order) {
        return "cannot ship new order";
    }
}
