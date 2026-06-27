# Java Low-Level Design Pattern Catalog

This repository is a Maven parent/child catalog of Java low-level design patterns.

## Build

```bash
mvn clean test
```

## Core design rules

- Single responsibility
- Open/closed
- Liskov substitution
- Interface segregation
- Dependency inversion
- Composition over inheritance
- Loose coupling, high cohesion

## Modules

### Creational

| Pattern | Module |
|---|---|
| Singleton | [SingletonPatternExample](SingletonPatternExample/README.md) |
| Factory Method | [FactoryMethodPatternExample](FactoryMethodPatternExample/README.md) |
| Builder | [BuilderPatternExample](BuilderPatternExample/README.md) |
| Prototype | [PrototypePatternExample](PrototypePatternExample/README.md) |
| Object Pool | [ObjectPoolPatternExample](ObjectPoolPatternExample/README.md) |
| Lazy Initialization | [LazyInitializationPatternExample](LazyInitializationPatternExample/README.md) |

### Structural

| Pattern | Module |
|---|---|
| Bridge | [BridgePatternExample](BridgePatternExample/README.md) |
| Composite | [CompositePatternExample](CompositePatternExample/README.md) |
| Decorator | [DecoratorPatternExample](DecoratorPatternExample/README.md) |
| Facade | [FacadePatternExample](FacadePatternExample/README.md) |
| Flyweight | [FlyweightPatternExample](FlyweightPatternExample/README.md) |

### Behavioral

| Pattern | Module |
|---|---|
| Chain of Responsibility | [ChainOfResponsibilityPatternExample](ChainOfResponsibilityPatternExample/README.md) |
| Command | [CommandPatternExample](CommandPatternExample/README.md) |
| Interpreter | [InterpreterPatternExample](InterpreterPatternExample/README.md) |
| Iterator | [IteratorPatternExample](IteratorPatternExample/README.md) |
| Mediator | [MediatorPatternExample](MediatorPatternExample/README.md) |
| State | [StatePatternExample](StatePatternExample/README.md) |
| Strategy | [StrategyPatternExample](StrategyPatternExample/README.md) |
| Visitor | [VisitorPatternExample](VisitorPatternExample/README.md) |

### Enterprise and application

| Pattern | Module |
|---|---|
| DAO | [DataAccessObjectPatternExample](DataAccessObjectPatternExample/README.md) |
| Dependency Injection | [DependencyInjectionPatternExample](DependencyInjectionPatternExample/README.md) |
| Interception Filter | [InterceptingFilterPatternExample](InterceptingFilterPatternExample/README.md) |

## Existing examples

| Pattern | Module |
|---|---|
| Abstract Factory | [AbstractFactoryExample](AbstractFactoryExample/README.md) |
| Adapter | [AdapterDesignPattern](AdapterDesignPattern/README.md) |
| Observer | [ObserverDesignPatternExample](ObserverDesignPatternExample/README.md) |
| Proxy | [ProxyPatternExample](ProxyPatternExample/README.md) |
| Service Locator | [ServiceLocatorPatternExample](ServiceLocatorPatternExample/README.md) |
