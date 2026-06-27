package com.vikram.designpatterns.state;

public class Order {
    private OrderState state = new NewOrderState();

    void setState(OrderState state) {
        this.state = state;
    }

    public String confirm() {
        return state.confirm(this);
    }

    public String ship() {
        return state.ship(this);
    }
}
