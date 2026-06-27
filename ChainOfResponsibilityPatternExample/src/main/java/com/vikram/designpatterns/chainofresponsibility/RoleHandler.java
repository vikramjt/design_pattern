package com.vikram.designpatterns.chainofresponsibility;

public class RoleHandler extends Handler {
    public RoleHandler(Handler next) {
        super(next);
    }

    @Override
    protected String process(Request request) {
        return request.authorized() ? null : "unauthorized";
    }
}
