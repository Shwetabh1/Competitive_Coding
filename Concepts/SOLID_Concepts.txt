"model your classes based on behaviours not on properties; model your data based on properties and not on behaviours. If it behaves like a duck, it's certainly a bird."


S.O.L.I.D

1. Single Responsibility Principle.
You should write, change and maintain a class for only one purpose. Why? because this will give us the flexibility to make changes in future without worrying the impacts of changes for another entity.

2. Open Closed Principle
"Software components should be open for extension, but closed for modification"
your classes should be designed such a way that whenever fellow developers wants to change the flow of control in specific conditions in application, all they need to extend your class and override some functions and that’s it. The design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code. 

Consider this example: A graphic editor class with methods draw circle, draw rectangle.. Everytime we want to add a new shape we need to modify this class.

Create a Abstract method shape in class shape that inherits from Graphci Editor. Just implement the method in new shapes yoou want to creaate.


BAD EXAMPLE : 

// Open-Close Principle - Bad example
 class GraphicEditor {
 
 	public void drawShape(Shape s) {
 		if (s.m_type==1)
 			drawRectangle(s);
 		else if (s.m_type==2)
 			drawCircle(s);
 	}
 	public void drawCircle(Circle r) {....}
 	public void drawRectangle(Rectangle r) {....}
 }

GOOD EXAMPLE

Graphic Editor
|
shape----------(abstract draw method)
|            |
Rectangle   Circle  implement the abstract method for any other shape


3. Liskov's Substitution Principle
"Derived types must be completely substitutable for their base types"

Consider the example, all squares are rectangle so you derive the square class from rectangle and modified few methods but the derived class won't be able to substitute the rectangle class.


It means that the classes fellow developer created by extending your class should be able to fit in application without failure.


4. Interface Segregation Principle
"Clients should not be forced to implement unnecessary methods which they will not use"

Take an example. Developer Alex created an interface Reportable and added two methods generateExcel() and generatedPdf(). Now client ‘A’ wants to use this interface but he intend to use reports only in PDF format and not in excel. Will he achieve the functionality easily.NO. He will have to implement two methods, out of which one is extra burden put on him by designer of software. Either he will implement another method or leave it blank. So are not desired cases, right??So what is the solution? Solution is to create two interfaces by breaking the existing one. They should be like PdfReportable and ExcelReportable. This will give the flexibility to user to use only required functionality only.

5. Dependency Inversion Principle
"Depend on abstractions, not on concretions"

In other words. you should design your software in such a way that various modules can be separated from each other using an abstract layer to bind them together. High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend upon details. Details should depend upon abstractions.

When this principle is applied it means the high level classes are not working directly with low level classes, they are using interfaces as an abstract layer. Because if high level classes are dependent on low level and if we need to change the low level class a lot of changes has to be done in all the dependent classes. That is why we need an abstarct layer. a class structure is to start from high level modules to the low level modules:
High Level Classes --> Abstraction Layer --> Low Level Classes

So from the principle we can say high level module should not depend on low level module. Both depend on abstraction. Abstraction should not depend on low level.Instead of lower level modules defining an interface that higher level module depend on, higher level modules define an interface that lower level module implement

Example bruh: COnsider a copy class that depends on lower level classes read from key board and write to a text file. Now after a while you have  to add the functionality to write to database. The write class is already complex and u would have to make  a lotta changes. Now if we have reader and writer interfaces then all we need to do is implement the interface to achieve new functionalities.


----COPY--CLASS-----------------
    /    \                   \
read_key  write_to_file       new requirement (everything gets complex..)


----COPY--CLASS-----------------
    /               \
reader_interface    Writer_interface 
   /                    \         \
  /                      \         \  
Read_Key                 wr_2_file  wr_2_db




Dependency Inversion Principle (DIP)	: Principle used in architecting software.
Inversion of Control (IoC)	: Pattern used to invert flow, dependencies and interfaces.
Dependency Injection (DI)	: Implementation of IoC to invert dependencies.
IoC Container	: Framework to do dependency injection. It Helps to map dependencies, manage object creation & lifetime.



DIP is a Software design principle and IoC is a Software design pattern. Let's see what is Software design principle and pattern.

Software design principle: Principle provides us guideline. Principle says what is right and what is wrong. It doesn’t say us how to solve problem. It just gives some guideline so that we can design good software and avoid bad design. Some principles are DRY, OCP, DIP etc.
Software design pattern: Pattern is a general reusable solution to a commonly occurring problem within a given context in software design. Some patterns are factory pattern, Decorator pattern etc.
Now we have everything for going details.

So principle defines good and bad. So we can say if we maintain principle during software design then it will be good design.


IOC helps in maintaining DIP.

IOC can be done via:
We can split IoC in following ways. (Description will be provided later)

Interface Inversion : Inverting interfaces.
Flow inversion : Invert the flow of control and it is the foundation idea of IoC which is similar to Don’t call us we will call you.
Creation Inversion : This is mostly used by developer. We will use it when we go to DI and IoC container.


(https://www.codeproject.com/Articles/538536/A-curry-of-Dependency-Inversion-Principle-DIP-Inve Finish IT)