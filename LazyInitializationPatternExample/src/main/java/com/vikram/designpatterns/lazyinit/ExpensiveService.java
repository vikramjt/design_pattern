package com.vikram.designpatterns.lazyinit;

public class ExpensiveService {
    private String value;

    public String getValue() {
        if (value == null) {
            value = load();
        }
        return value;
    }

    private String load() {
        return "Loaded on demand";
    }
}
