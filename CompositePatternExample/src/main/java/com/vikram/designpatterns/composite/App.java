package com.vikram.designpatterns.composite;

public class App {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new FileItem("readme.md"));
        Folder src = new Folder("src");
        src.add(new FileItem("App.java"));
        root.add(src);
        System.out.println(root.describe(""));
    }
}
