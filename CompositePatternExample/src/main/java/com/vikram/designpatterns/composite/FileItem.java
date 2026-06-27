package com.vikram.designpatterns.composite;

public class FileItem implements Node {
    private final String name;

    public FileItem(String name) {
        this.name = name;
    }

    @Override
    public String describe(String indent) {
        return indent + "- " + name + "\n";
    }
}
