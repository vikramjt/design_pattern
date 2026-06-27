package com.vikram.designpatterns.mediator;

public class User {
    private final String name;
    private final ChatRoom room;

    public User(String name, ChatRoom room) {
        this.name = name;
        this.room = room;
    }

    public void send(String message) {
        room.send(name, message);
    }
}
