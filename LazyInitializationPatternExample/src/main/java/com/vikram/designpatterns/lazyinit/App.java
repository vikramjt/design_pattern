package com.vikram.designpatterns.lazyinit;

public class App {
    public static void main(String[] args) {
        ExpensiveService service = new ExpensiveService();
        System.out.println(service.getValue());
        System.out.println(service.getValue());
    }
}
