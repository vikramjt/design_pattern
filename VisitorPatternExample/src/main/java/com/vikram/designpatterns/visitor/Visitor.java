package com.vikram.designpatterns.visitor;

public interface Visitor {
    int visit(Book book);
    int visit(Pen pen);
}
