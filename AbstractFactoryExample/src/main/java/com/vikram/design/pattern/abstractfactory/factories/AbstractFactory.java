package com.vikram.design.pattern.abstractfactory.factories;

public interface AbstractFactory<T> {
    T create(String type) ;
}
