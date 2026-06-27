package com.vikram.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public int accept(Visitor visitor) {
        return items.stream().mapToInt(item -> item.accept(visitor)).sum();
    }
}
