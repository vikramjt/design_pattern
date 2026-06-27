package com.vikram.designpatterns.bridge;

public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
    String status();
}
