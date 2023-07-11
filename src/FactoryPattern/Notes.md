# **Creational design patterns - Factory**

#### In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses

The Factory Method design pattern solves problems like:

How can an object be created so that subclasses can redefine which class to instantiate?
How can a class defer instantiation to subclasses?
The Factory Method design pattern describes how to solve such problems:

Define a separate operation (factory method) for creating an object.
Create an object by calling a factory method.

### Abstract Factory

##### Split the interface into two parts
* Attributes & and Non factory methods.
* Factory methods.

### Practical Factory

Whenever multiple variants of factories are there it will violate Ocp in our Main class so better to move the logic of creation of factory in a separate class.
