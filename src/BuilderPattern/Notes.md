# **Creational design patterns - Builder**


## Problems

* **Complex object creation -** There are multiple ways to create an object, but constructors are the
primary technique used for creating instances of a class. However, constructors become
unmanageable when there is a need to create an object with many parameters. This is known as the
telescoping constructor anti-pattern. The telescoping constructor anti-pattern is a code smell that
indicates that the class has too many constructors. This is a code smell because it is difficult to
maintain and extend the class.


* **Validation and failing object creation -** There are cases when you want to validate the
parameters before creating an object. For example, you might want to validate the parameters before
creating a database connection. If the parameters are invalid, you might want to throw an exception.
However, if we use the default constructor, we cannot fail object creation.


* **Immutability -** Mutable objects are objects whose state can be changed after they are created.
Immutable objects are objects whose state cannot be changed after they are created. Immutable
objects are easier to maintain and extend whereas mutable objects can lead to bugs. However, if we
use the default constructor, we cannot create immutable objects.