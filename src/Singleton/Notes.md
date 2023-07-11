# **Creational design patterns - Singleton**

* Only one object of a class can be created.
* Objects are costly to create
* Objects are shared
* Objects takes alot of time to create
* Examples : Db connection , Logger

### There are two forms of singleton design pattern

Early Instantiation: creation of instance at load time.
Lazy Instantiation: creation of instance when required.


### Advantage of Singleton design pattern

Saves memory because object is not created at each request. Only single instance is reused again and again.

### Usage of Singleton design pattern

Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.