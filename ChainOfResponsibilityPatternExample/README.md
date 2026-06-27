# Chain of Responsibility Pattern

## Working

Passes a request through a chain of handlers until one of them processes it.

## Advantages

- Flexible request handling
- Easy to add new handlers
- Decouples sender and receiver

## Disadvantages

- Request may go through many handlers
- Flow can be hard to follow

## Usage

- Validation pipelines
- Middleware chains
- Request filtering

## Example

`App.java` is the module entry point.
