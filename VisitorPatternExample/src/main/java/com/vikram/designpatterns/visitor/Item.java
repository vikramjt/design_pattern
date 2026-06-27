package com.vikram.designpatterns.visitor;

public interface Item {
    int accept(Visitor visitor);
}
