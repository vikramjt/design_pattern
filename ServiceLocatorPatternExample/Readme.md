:# Service Locator Pattern

## Working

Provides a central lookup point for services and returns them on demand.

## Advantages

- Centralized service lookup
- Easy reuse of shared services
- Simple for small systems

## Disadvantages

- Hides dependencies
- Harder to test than dependency injection
- Runtime failures can surface late

## Usage

- Legacy applications
- Service registry style lookups
- Small systems with shared services

## Example

`App.java` is the module entry point.