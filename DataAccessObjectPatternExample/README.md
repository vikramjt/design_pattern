# DAO Pattern

## Working

Separates the persistence layer from the business logic through a data-access interface.

## Advantages

- Isolates database code
- Easier to test
- Swaps storage implementations more easily

## Disadvantages

- Extra abstraction layer
- Can be redundant for tiny apps

## Usage

- CRUD-heavy applications
- Repository-like persistence access
- Database abstraction

## Example

`App.java` is the module entry point.
