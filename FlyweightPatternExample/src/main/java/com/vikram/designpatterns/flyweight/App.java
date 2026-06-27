package com.vikram.designpatterns.flyweight;

public class App {
    public static void main(String[] args) {
        TreeFactory factory = new TreeFactory();
        Tree oak1 = factory.getTree("oak");
        Tree oak2 = factory.getTree("oak");
        System.out.println(oak1 == oak2);
        System.out.println(oak1.render(10, 20));
    }
}
