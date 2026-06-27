package com.vikram.designpatterns.interceptingfilter;

public class LoggingFilter implements Filter {
    @Override
    public String apply(Request request) {
        return "log " + request.path();
    }
}
