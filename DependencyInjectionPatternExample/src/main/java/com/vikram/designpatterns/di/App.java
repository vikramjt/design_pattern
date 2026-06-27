package com.vikram.designpatterns.di;

public class App {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        Greeter greeter = new Greeter(service);
        System.out.println(greeter.greet("Vikram"));
    }
}
