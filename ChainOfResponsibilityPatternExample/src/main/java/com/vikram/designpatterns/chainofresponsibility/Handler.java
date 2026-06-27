package com.vikram.designpatterns.chainofresponsibility;

public abstract class Handler {
    private final Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public String handle(Request request) {
        String result = process(request);
        return result != null ? result : next != null ? next.handle(request) : "rejected";
    }

    protected abstract String process(Request request);
}
