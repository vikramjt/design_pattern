package com.vikram.designpatterns.state;

public interface OrderState {
    String confirm(Order order);
    String ship(Order order);
}
