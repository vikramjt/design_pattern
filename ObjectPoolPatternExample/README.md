# Object Pool Pattern

## Working

Keeps a reusable pool of objects and hands them out when needed instead of creating them each time.

## Advantages

- Saves creation cost
- Controls resource usage
- Good for expensive shared objects

## Disadvantages

- Pool management overhead
- Risk of stale or leaked objects
- Can reduce clarity if overused

## Usage

- Database connections
- Threads or worker objects
- Buffer reuse

## Example

`App.java` is the module entry point.
