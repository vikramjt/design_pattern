package com.vikram.designpatterns.interceptingfilter;

public class AuthFilter implements Filter {
    @Override
    public String apply(Request request) {
        return "auth ok";
    }
}
