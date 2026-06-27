package com.vikram.designpatterns.chainofresponsibility;

public class AuthHandler extends Handler {
    public AuthHandler(Handler next) {
        super(next);
    }

    @Override
    protected String process(Request request) {
        return request.authenticated() ? null : "unauthenticated";
    }
}
