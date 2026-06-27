package com.vikram.designpatterns.bridge;

public abstract class Remote {
    protected final Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.turnOn();
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public Device getDevice() {
        return device;
    }
}
