package com.vikram.designpatterns.iterator;

public class App {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection("alice", "bob", "carol");
        for (String name : collection) {
            System.out.println(name);
        }
    }
}
