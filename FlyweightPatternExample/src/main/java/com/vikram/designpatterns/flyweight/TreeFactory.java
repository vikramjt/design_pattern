package com.vikram.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private final Map<String, Tree> cache = new HashMap<>();

    public Tree getTree(String type) {
        return cache.computeIfAbsent(type, Tree::new);
    }
}
