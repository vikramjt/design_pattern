package com.vikram.designpatterns.mediator;

public class App {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User alice = new User("alice", room);
        User bob = new User("bob", room);
        alice.send("hello");
        bob.send("hi");
        System.out.println(room.getTranscript());
    }
}
