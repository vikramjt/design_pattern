package com.vikram.designpatterns.bridge;

public class Television implements Device {
    private boolean on;
    private int channel;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String status() {
        return "TV on=" + on + ", channel=" + channel;
    }
}
