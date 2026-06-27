package com.vikram.designpatterns.factorymethod;

public class EmailNotification implements Notification {
    @Override
    public String deliver(String message) {
        return "Email: " + message;
    }
}
