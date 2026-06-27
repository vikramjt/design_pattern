# Singleton Pattern

## Working

Creates one shared instance and exposes a global access point to it. This module shows two thread-safe lazy versions: initialization-on-demand holder and double-checked locking.

## Advantages

- Guarantees a single instance
- Avoids duplicate resource setup
- Easy global access

## Disadvantages

- Hidden global state
- Harder to test
- Can become a coupling point

## Usage

- Logger
- Configuration store
- Cache or registry
- Connection manager when one shared instance is enough

## Example

`App.java` shows both lazy singleton variants.
