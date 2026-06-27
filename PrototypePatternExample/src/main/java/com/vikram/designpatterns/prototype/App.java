package com.vikram.designpatterns.prototype;

public class App {
    public static void main(String[] args) {
        Document original = new Document("Design doc", new StringBuilder("Initial content"));
        Document copy = original.clone();
        copy.setTitle("Copy");
        copy.getContent().append(" updated");
        System.out.println(original);
        System.out.println(copy);
    }
}
