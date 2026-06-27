package com.vikram.designpatterns.builder;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .processor("Intel i7")
                .memoryGb(32)
                .storageGb(1024)
                .build();
        System.out.println(computer);
    }
}
