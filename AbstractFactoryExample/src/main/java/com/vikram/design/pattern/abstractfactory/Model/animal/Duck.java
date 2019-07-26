package com.vikram.design.pattern.abstractfactory.Model.animal;

public class Duck implements Animal {
	 
    public String getAnimal() {
        return "Duck";
    }
 
    public String makeSound() {
        return "Squeks";
    }
}
