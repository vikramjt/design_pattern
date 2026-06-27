# Observer Pattern

## Working

Maintains a list of subscribers and notifies them when the subject state changes.

## Advantages

- Loose coupling between subject and observers
- Easy to add new subscribers
- Good for event-driven systems

## Disadvantages

- Notification order can matter
- Too many observers can create noise

## Usage

- Event handling
- UI updates
- Publish/subscribe workflows

## Example

`App.java` is the module entry point.
