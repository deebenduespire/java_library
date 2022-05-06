## Liskov Substitution Principle
The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
That requires the objects of your subclasses to behave in the same way as the objects of your superclass.
You can achieve that by following a few rules, which are pretty similar to the design by contract concept defined by Bertrand Meyer.

YAGNI - You are not going to need it
The basic idea is not to force based class to implement the methods that are not required