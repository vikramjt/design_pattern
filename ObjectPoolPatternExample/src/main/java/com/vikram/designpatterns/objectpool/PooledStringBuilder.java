package com.vikram.designpatterns.objectpool;

public class PooledStringBuilder {
    private final StringBuilder builder = new StringBuilder();

    public StringBuilder getBuilder() {
        return builder;
    }

    public void reset() {
        builder.setLength(0);
    }
}
