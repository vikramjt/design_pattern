package com.vikram.designpatterns.interpreter;

public class ContainsExpression implements Expression {
    private final String key;
    private final String term;

    public ContainsExpression(String key, String term) {
        this.key = key;
        this.term = term;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(key + "=") && context.contains(term);
    }
}
