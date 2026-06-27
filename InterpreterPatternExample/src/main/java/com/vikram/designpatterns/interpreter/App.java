package com.vikram.designpatterns.interpreter;

public class App {
    public static void main(String[] args) {
        Expression expression = new AndExpression(
                new EqualsExpression("role", "admin"),
                new ContainsExpression("message", "ok"));
        System.out.println(expression.interpret("role=admin;message=ok"));
    }
}
