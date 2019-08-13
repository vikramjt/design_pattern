1) Creational Pattern
Factory Method Pattern
Abstract Factory Pattern
Singleton Pattern
Prototype Pattern
Builder Pattern
Object Pool Pattern

2) Structural Pattern
Adapter Pattern
Bridge Pattern
Composite Pattern
Decorator Pattern
Facade Pattern
Flyweight Pattern
proxy Pattern

3) Behavioral Pattern
Chain of ResponsibilityCommand Pattern
Interpreter Pattern
Iterator Pattern
Mediator Pattern
Memento Pattern
Observer Pattern
State Pattern
Strategy Pattern
Template Pattern

:::::: Creational Design Patterns ::::::

Creational Design Patterns are concerned with the way in which objects are created. They reduce complexities and instability by creating objects in a controlled manner.

The new operator is often considered harmful as it scatters objects all over the application. Over time it can become challenging to change an implementation because classes become tightly coupled.

Creational Design Patterns address this issue by decoupling the client entirely from the actual initialization process.

In this article, we’ll discuss four types of Creational Design Pattern:

Singleton – Ensures that at most only one instance of an object exists throughout application
Factory Method – Creates objects of several related classes without specifying the exact object to be created
Abstract Factory – Creates families of related dependent objects
Builder – Constructs complex objects using step-by-step approach

++++++++++++++++++++++++++++++++++++++++

:::::::::::::::Singleton Design Pattern ::::::::::::::::

The Singleton Design Pattern aims to keep a check on initialization of objects of a particular class by ensuring that only one instance of the object exists throughout the Java Virtual Machine.

A Singleton class also provides one unique global access point to the object so that each subsequent call to the access point returns only that particular object.