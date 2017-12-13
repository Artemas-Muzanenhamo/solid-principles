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
    
![User-to-Code](https://user-images.githubusercontent.com/29547780/33953423-cf8ced24-e02c-11e7-9f56-7c2d8505ee0a.png)

The only way to get transparency, however, is to start with the user and work your way down 
to the hardware. In other words, the highest level objects should all be things that make sense 
to your users. Things like databases and UI stuff should be buried deep in the code where nobody 
but you has to look at them.

### Simplicity

- The Code should do EXACTLY what is necessary and nothing more!

## Build and Design Incrementally

- We should be designing and building incrementally, one small piece at a time.
- Generally big upfront designs are never correct and that places us in situations such as:
    - Either we have to write a lot of code that is more complex than necessary because it's supporting an incorrect design. 
    - Or we have to go back and modify code that we wrote earlier because we wrote it based on incorrect assumptions.
- So the best approach is to design incrementally.