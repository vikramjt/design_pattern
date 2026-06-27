package com.vikram.designpatterns.mediator;

public class ChatRoom {
    private final StringBuilder transcript = new StringBuilder();

    public void send(String from, String message) {
        transcript.append(from).append(": ").append(message).append('\n');
    }

    public String getTranscript() {
        return transcript.toString();
    }
}
