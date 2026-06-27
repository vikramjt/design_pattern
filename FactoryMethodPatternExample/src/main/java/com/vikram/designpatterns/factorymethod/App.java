package com.vikram.designpatterns.factorymethod;

public class App {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.create("sms");
        System.out.println(notification.deliver("Pattern ready"));
    }
}
