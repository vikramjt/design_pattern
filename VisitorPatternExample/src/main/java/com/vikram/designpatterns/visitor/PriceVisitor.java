package com.vikram.designpatterns.visitor;

public class PriceVisitor implements Visitor {
    @Override
    public int visit(Book book) {
        return book.price();
    }

    @Override
    public int visit(Pen pen) {
        return pen.price();
    }
}
