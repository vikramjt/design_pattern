package com.vikram.designpatterns.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        Handler chain = new AuthHandler(new RoleHandler(new PayloadHandler(null)));
        System.out.println(chain.handle(new Request(true, true, "ok")));
    }
}
