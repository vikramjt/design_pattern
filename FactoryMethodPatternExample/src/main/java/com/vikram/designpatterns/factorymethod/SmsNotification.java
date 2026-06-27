package com.vikram.designpatterns.factorymethod;

public class SmsNotification implements Notification {
    @Override
    public String deliver(String message) {
        return "SMS: " + message;
    }
}
