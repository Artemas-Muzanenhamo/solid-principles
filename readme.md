# Solid Principles and OO Design

This will be a simple example to dive into the SOLID Principles but 
also primarily understanding Objects and Object Oriented Design.

## Basics

OO Programming | OO Design
:---:|:---:
Using OO Language Features. | Leveraging OO Principles to make your code more effective.

The thing is one can write an application using all the OO programming features without 
the slightest knowledge of OO Design. However, what makes it truly OO is that besides using
OO programming features, you are also leveraging OO principles to make your code more 
effective.

The unifying matter here is `maintenance`! We are trying to write the code to be as 
maintainable as possible and `maintenance` starts 2 seconds after you write the code.

### Transparency

The first notion of importance is `Transparency`. 
- It should be immediately obvious how the code works or should work.
- If you go back to your own code and cannot figure out what it is doing, 
then you are violating this principle.
- It does NOT mean that you should expose how the `Object` works.
- The interface to the `Object` should be instantly obvious to anybody reading
the code.
    - Method Names (You are using methods to ask Objects to do something for you. If
    a method name does not have a verb in it, then it cannot possibly be self-explanatory.)
    - An `Object` should make sense in the `domain` of whatever problem you are solving. (If
    you are creating an accounting app then we would expect objects on the order of 
    `Ledger`, `Debit`, `Credit` and things that make sense to an accountant).
    
<p align="center">
    <img src="https://user-images.githubusercontent.com/29547780/33953423-cf8ced24-e02c-11e7-9f56-7c2d8505ee0a.png"></img>
</p>

The only way to get transparency, however, is to start with the user and work your way down 
to the hardware. In other words, the highest level objects should all be things that make sense 
to your users. Things like databases and UI stuff should be buried deep in the code where nobody 
but you has to look at them.

### Simplicity

- The Code should do EXACTLY what is necessary and nothing more!

### Build and Design Incrementally

- We should be designing and building incrementally, one small piece at a time.
- Generally big upfront designs are never correct and that places us in situations such as:
    - Either we have to write a lot of code that is more complex than necessary because it's supporting an incorrect design. 
    - Or we have to go back and modify code that we wrote earlier because we wrote it based on incorrect assumptions.
- So the best approach is to design incrementally.

## Coherence (Cohesion)

*Cohesion is defined as the degree to which all elements of a module, class, or component work together as a functional unit. 
High cohesion is good, and low cohesion is bad.*

- Group members are related.
- We should maximise cohesion
    - All members of a public methods class should form a cohesive group (a group of related members).
    - They should be related to each other in terms of what they are doing.
    - The methods and fields of a Class should focus on solving a specific
    and particular problem.
    
## Coupling

On the flip side of cohesion is coupling. Coupling is defined as the degree of interdependence 
between two or more classes, modules, or components. Tight coupling is bad, and loose coupling is good.

- A change to one thing affects another thing.
- A good example of undesired coupling would be a global variable in a program. The problem here is not so much the 
variable as the things that use the variable. If two functions or two methods share a global variable, then if you 
change one of those functions, you're going to have to go look at the other one as well.
- Maximise cohesion and minimise coupling.
- We cannot eliminate coupling entirely but we should aim to limit it as much
as we can.

### Messages
- Objects send messages to one another.

### Methods
- Handle messages.

### Functions
- Do arbitrary work.

## What is an Object?

- It is a black box.
- Objects are defined by what they `DO` not what they `contain`.
- They have responsibilities such as doing cohesive/coherent operations.
- The concept is `Data Abstraction` or `Implementation Hiding` in other words
we do not know how the object works.

### Single Responsibility

<p align="center">
    <img src="https://user-images.githubusercontent.com/29547780/33959205-9f888aa4-e03e-11e7-8c8d-76ee65319f21.png"></img>
</p>

- An object should be responsible for doing only one thing.
- Every module or class should have responsibility over a single part of the 
functionality provided by the software, and that responsibility should be 
entirely encapsulated by the class.
- All of the functions are focused on particular job or a single objective.

### How do the objects interact with one another?

- The concept here is that the `object should ask for help` and `not for information`.
- If we are asking for information from objects then we have much tighter coupling.
- The `object` that has the information does the work for us. This principle is called
`Delegation`.
- It is more suitable to push information to an object than it is pulling from an object.
-  The basic idea is that it should be possible at all times to radically change the 
implementation of some class without impacting the clients, without impacting any of 
the objects that use that class. In other words, you ought to be able to throw out 
everything except the public interface. You ought to be able to throw out all of the 
fields, you ought to be able to throw out the implementation of every method inside 
the class and replace those methods with completely different implementations that 
use completely different fields that are completely different types and none of the 
objects that use your class should know that that change has happened.
- A given Class shouldn't know who's talking to it (Abstraction).

# Defining Behaviour and State()


