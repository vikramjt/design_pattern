package com.vikram.design.pattern.abstractfactory;

import com.vikram.design.pattern.abstractfactory.Model.animal.Animal;
import com.vikram.design.pattern.abstractfactory.Model.color.Color;
import com.vikram.design.pattern.abstractfactory.factories.AbstractFactory;
import com.vikram.design.pattern.abstractfactory.factories.FactoryProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");
        
        Animal animal = animalFactory.create("Duck");
        System.out.println("Animal is : " + animal.getAnimal() + " And it sound : " + animal.makeSound());
        
        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");
        
        Color color = colorFactory.create("White");
        
        System.out.println("Color is : " + color.getColor());
    }
}
