package com.vikram.design.pattern.abstractfactory.Model.animal;

public class Dog implements Animal {
	 
    public String getAnimal() {
        return "Dog";
    }
 
    public String makeSound() {
        return "Bark";
    }
}