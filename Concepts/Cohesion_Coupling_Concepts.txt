High Cohesion
Low Coupling

Cohesion = Focused within a class.

Has a defined functinality built around single responsibility principle.
Coupling = Connection within classes.

Encapsulation:

Most developers define encapsulation as information hiding. However, this definition often leads to an incomplete understanding and implementation of encapsulation. It seems that many people see the word information and think data or properties. Based on this they try to make public properties that wrap around private fields, or make properties private instead of public. This perspective, unfortunately, misses out on a tremendous opportunity that encapsulation provides: to hide not just data, but process and logic as well.

Strong encapsulation is evidenced by the ability for a developer to use a given class or module by its interface, alone. The developer does not, and should not, need to know the implementation specifics of the class or module.


      A      B
      |      |
       - ___ -  
c-----> | E | <---------  D
         ___

The ability to use E without needing to know the inner details is encapsulation. No matter what kinda changes happen inside  Other classes can use it via Interface. IF we take an electric saw we just need to press the button. The rest will be done.


Abstraction, Polymorphism Inheritance and Encapsulation. (APIE) with examples





