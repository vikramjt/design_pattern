package com.vikram.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Node {
    private final String name;
    private final List<Node> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Node node) {
        children.add(node);
    }

    @Override
    public String describe(String indent) {
        StringBuilder builder = new StringBuilder(indent + "+ " + name + "\n");
        for (Node child : children) {
            builder.append(child.describe(indent + "  "));
        }
        return builder.toString();
    }
}
