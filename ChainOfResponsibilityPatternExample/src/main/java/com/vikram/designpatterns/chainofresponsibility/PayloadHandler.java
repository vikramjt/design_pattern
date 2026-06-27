package com.vikram.designpatterns.chainofresponsibility;

public class PayloadHandler extends Handler {
    public PayloadHandler(Handler next) {
        super(next);
    }

    @Override
    protected String process(Request request) {
        return "processed: " + request.payload();
    }
}
