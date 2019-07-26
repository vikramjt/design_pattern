:::::Understanding the Pattern::::

The purpose of the Service Locator pattern is to return the service instances on demand. This is useful for decoupling service consumers from concrete classes.

An implementation will consist of the following components:

Client – the client object is a service consumer. It’s responsible for invoking the request from the service locator
Service Locator – is a communication entry point for returning the services from the cache
Cache – an object for storing service references to reuse them later
Initializer – creates and registers references to services in the cache
Service – the Service component represents the original services or their implementation
The original service object is looked up by the locator and returned on demand.

++++++++++++++++++++++++++++++++++++++++++++++++++

:::Service Locator vs Dependency Injection:::

At first glance, the Service Locator pattern may look similar to another well-known pattern – namely, Dependency Injection.

First, it’s important to note that both Dependency Injection and the Service Locator pattern are implementations of the Inversion of Control concept.

Before going further, learn more about Dependency Injection in this write-up.

The key difference here is that the client object still creates its dependencies. It just uses the locator for that, meaning it needs a reference to the locator object.

By comparison, when using the dependency injection, the class is given the dependencies. The injector is called only once at startup to inject dependencies into the class.

Finally, let’s consider a few reasons to avoid using the Service Locator pattern.

One argument against it is that it makes unit testing difficult. With dependency injection, we can pass mock objects of the dependent class to the tested instance. On the other hand, this is a bottleneck with the Service Locator pattern.

Another issue is that it’s trickier to use APIs based on this pattern. The reason for this is that the dependencies are hidden inside the class and they’re only verified at runtime.

Despite all of this, the Service Locator pattern is easy to code and understand, and can be a great choice for small applications.