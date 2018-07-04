What do you understand by Model View Controller?!

MVC, a design Pattern, is all about seperation of concerns. This design pattern organises code in an application to improve maintainability.

What is Design Pattern?
A design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.

Let's try to understand MVC using a simple analogy.
Imagine a photographer with his camera in a studio. A customer asks him to take a photo of a box. The box is the model, the photographer is the controller and the camera is the view. Because the box does not know about the camera or the photographer, it is completely independent. This separation allows the photographer to walk around the box and point the camera at any angle to get the shot/view that he wants.

The Model is responsible for managing all sorts of data while the view is responsible for the outside world to interact and maybe make changes to this data. The model provides an API to interact with it. The View/Controller provides an external interface (GUI/CLI/web form/high-level IPC/etc.) to enable everything outwith the program to communicate with it. The Model contains no View/Controller code; no GUI widget classes, no code for laying out dialog boxes or receiving user input. The View/Controller contains no Model code; no code for validating URLs or performing SQL queries, and no original state either: any data held by widgets is for display purposes only, and merely a reflection of the true data stored in the Model.

The model manages fundamental behaviors and data of the application. It can respond to requests for information, respond to instructions to change the state of its information, and even to notify observers in event-driven systems when information changes. This could be a database, or any number of data structures or storage systems. In short, it is the data and data-management of the application.

The view effectively provides the user interface element of the application. It'll render data from the model into a form that is suitable for the user interface.

The controller receives user input and makes calls to model objects and the view to perform appropriate actions.

Now, here's the test of a true MVC design: the program should in essence be fully functional even without a View/Controller attached. OK, the outside world will have trouble interacting with it in that form, but as long as one knows the appropriate Model API incantations, the program will hold and manipulate data as normal.	

