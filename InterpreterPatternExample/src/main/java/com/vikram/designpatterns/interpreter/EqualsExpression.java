package com.vikram.designpatterns.interpreter;

public class EqualsExpression implements Expression {
    private final String key;
    private final String expected;

    public EqualsExpression(String key, String expected) {
        this.key = key;
        this.expected = expected;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(key + "=" + expected);
    }
}
