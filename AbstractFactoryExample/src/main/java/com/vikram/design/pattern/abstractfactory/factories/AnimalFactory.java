package com.vikram.design.pattern.abstractfactory.factories;

import com.vikram.design.pattern.abstractfactory.Model.animal.Animal;
import com.vikram.design.pattern.abstractfactory.Model.animal.Bear;
import com.vikram.design.pattern.abstractfactory.Model.animal.Dog;
import com.vikram.design.pattern.abstractfactory.Model.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
	 
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }else if ("Bear".equalsIgnoreCase(animalType)) {
            return new Bear();
        }
 
        return null;
    }
 
}
