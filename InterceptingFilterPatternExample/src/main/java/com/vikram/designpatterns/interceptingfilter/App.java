package com.vikram.designpatterns.interceptingfilter;

public class App {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.add(new AuthFilter());
        chain.add(new LoggingFilter());
        System.out.println(chain.doFilter(new Request("/api/ping")));
    }
}
