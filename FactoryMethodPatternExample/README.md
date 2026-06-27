# Factory Method Pattern

## Working

Defines a method for creating objects, but lets subclasses decide which concrete type to return.

## Advantages

- Hides construction details
- Supports new product types without changing client code
- Promotes loose coupling

## Disadvantages

- Adds more classes
- Can be overkill for simple creation logic

## Usage

- Framework APIs
- Plugin creation
- Product families with varying implementations

## Example

`App.java` is the module entry point.
