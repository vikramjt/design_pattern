package com.vikram.designpatterns.di;

public class Greeter {
    private final GreetingService service;

    public Greeter(GreetingService service) {
        this.service = service;
    }

    public String greet(String name) {
        return service.greet(name);
    }
}
