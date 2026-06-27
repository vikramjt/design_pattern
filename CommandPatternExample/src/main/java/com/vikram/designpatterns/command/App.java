package com.vikram.designpatterns.command;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(new LightOnCommand(light));
        System.out.println(remote.pressButton());
    }
}
