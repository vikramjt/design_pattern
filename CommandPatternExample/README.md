# Command Pattern

## Working

Turns a request into an object so it can be queued, logged, or undone.

## Advantages

- Decouples invoker and receiver
- Supports undo/redo
- Easy to queue or schedule actions

## Disadvantages

- Adds many small classes
- Can be unnecessary for simple calls

## Usage

- Undo systems
- Job queues
- Macro commands

## Example

`App.java` is the module entry point.
