package com.vikram.designpatterns.facade;

public class App {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        System.out.println(facade.watchMovie("LLD Patterns"));
    }
}
