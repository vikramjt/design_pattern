package com.vikram.designpatterns.chainofresponsibility;

public record Request(boolean authenticated, boolean authorized, String payload) {
}
