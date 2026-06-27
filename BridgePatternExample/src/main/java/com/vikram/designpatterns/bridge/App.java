package com.vikram.designpatterns.bridge;

public class App {
    public static void main(String[] args) {
        Remote tvRemote = new BasicRemote(new Television());
        tvRemote.togglePower();
        tvRemote.setChannel(5);
        System.out.println(tvRemote.getDevice().status());
    }
}
