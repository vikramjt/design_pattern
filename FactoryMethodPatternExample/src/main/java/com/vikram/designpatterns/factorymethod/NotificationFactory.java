package com.vikram.designpatterns.factorymethod;

public final class NotificationFactory {
    private NotificationFactory() {
    }

    public static Notification create(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
