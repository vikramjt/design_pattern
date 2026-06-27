# Lazy Initialization Pattern

## Working

Creates an object only when it is first needed, not at startup.

## Advantages

- Faster startup
- Avoids unnecessary allocation
- Good for expensive optional objects

## Disadvantages

- Can add synchronization complexity
- First access may be slower

## Usage

- Heavy services
- Optional caches
- Deferred resource loading

## Example

`App.java` is the module entry point.
