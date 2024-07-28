


# **📚 Virtual Classroom Management Application**

Welcome to the **Virtual Classroom Management Application**! This powerful Java-based solution offers a complete set of tools for managing virtual classrooms, including student enrollment, assignment scheduling, and more. Designed with robust features and a user-friendly interface, this application is ideal for educators and administrators seeking efficient classroom management.

## **🎯 Key Features**

- **Classroom Management**:
  - Add and remove classrooms effortlessly.
  - View and manage all existing classrooms.

- **Student Management**:
  - Enroll students into classrooms.
  - List all students in a specific classroom.

- **Assignment Management**:
  - Schedule and remove assignments with ease.
  - Submit assignments and ensure compliance with deadlines.

- **Conflict Detection**:
  - Detect and handle conflicts between scheduled assignments.

- **Logging and Monitoring**:
  - Custom logging for all actions and events.
  - Monitor and notify changes related to assignments and classrooms.

## **🛠️ Technologies Used**

- **Programming Language**: Java
- **Design Patterns**: Singleton Pattern, Factory Pattern, Observer Pattern
- **Logging**: Custom Logger
- **Version Control**: Git

## **📋 Prerequisites**

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)**
- **Git**

## **🚀 Installation**

### **Clone the Repository**

```bash
git clone [https://github.com/your-repo/virtual-classroom-management.git](https://github.com/theerajn/ei-project.git)
```

### **Navigate to Project Directory**

```bash
cd project_ei
```

### **Compile the Java Files**

Ensure that you have the JDK installed. Compile the Java source files using:

```bash
 javac -d bin src/exercise2/*.java

```

### **Run the Application**

Execute the application using:

```bash
java -cp bin exercise2.Main

```

## **📚 Usage Instructions**

Once the application is running, follow the console prompts to manage your virtual classroom:

- **Add a Classroom**: 
  - Input the desired classroom name.

- **Remove a Classroom**:
  - Provide the classroom name to be removed.

- **List Classrooms**:
  - Display all existing classrooms.

- **Add a Student**:
  - Enter the student ID and the classroom name.

- **List Students in a Classroom**:
  - View all students within a specified classroom.

- **Schedule an Assignment**:
  - Input the classroom name and assignment details.

- **Remove an Assignment**:
  - Enter the classroom name and the assignment details to be removed.

- **Submit an Assignment**:
  - Provide the student ID, classroom name, and assignment details.

- **Exit the Application**:
  - Choose this option to exit.

## **🛡️ Design Patterns**

This application employs several design patterns to ensure efficiency and maintainability:

- **Singleton Pattern**: Ensures a single instance of the `VirtualClassroomManager` for consistent management.
- **Factory Pattern**: Simplifies the creation of `Classroom` instances.
- **Observer Pattern**: Monitors and notifies changes in assignment scheduling and status.

## **📜 Code Structure**

- **Main.java**: Entry point for the application, managing user input and interaction.
- **VirtualClassroomManager.java**: Central management for classrooms and students, handling core functionalities.
- **Classroom.java**: Represents a classroom, managing assignments and notifying observers.
- **Student.java**: Manages student details and assignment submissions.
- **LoggerManager.java**: Provides custom logging for auditing actions and events.
- **ClassroomFactory.java**: Factory class for creating classroom instances.

## **🤝 Contributing**

We welcome contributions to improve and extend the functionality of this application. Please fork the repository and submit a pull request with detailed information about your changes.

## **📜 License**

This project is licensed under the MIT License. For more details, see the LICENSE file.

 **🛠️ Design Patterns Showcase**

Welcome to the **Design Patterns Showcase**! This project demonstrates six different software design patterns, with use cases provided for behavioral, creational, and structural patterns. The implementation is available in Java, C#, or TypeScript. Explore the code to understand how these patterns can be applied to solve common software design problems.

## **🎯 Design Patterns Demonstrated**

### **1. Creational Patterns**

#### **Singleton Pattern**

**Use Case**: Ensures a single instance of a class is created and provides a global point of access to that instance. Useful for managing shared resources like configuration settings or a connection pool.

- **Example**: `ConfigurationManager.java` – Manages application configuration settings.

#### **Factory Pattern**

**Use Case**: Provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. Useful for managing and decoupling the creation of complex objects.

- **Example**: `ShapeFactory.java` – Creates different types of shapes based on user input.

### **2. Structural Patterns**

#### **Adapter Pattern**

**Use Case**: Allows incompatible interfaces to work together by converting the interface of a class into another interface that clients expect. Useful for integrating third-party libraries with existing code.

- **Example**: `MediaPlayerAdapter.java` – Adapts a new media player to work with an existing media interface.

#### **Decorator Pattern**

**Use Case**: Adds new functionalities to objects dynamically without altering their structure. Useful for extending the behavior of objects in a flexible and reusable way.

- **Example**: `CoffeeDecorator.java` – Adds different types of additives (like milk or sugar) to a basic coffee object.

### **3. Behavioral Patterns**

#### **Observer Pattern**

**Use Case**: Defines a dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. Useful for implementing distributed event handling systems.

- **Example**: `WeatherStation.java` – Notifies observers (displays) about changes in weather data.

#### **Strategy Pattern**

**Use Case**: Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. Useful for allowing the algorithm to vary independently from the clients that use it.

- **Example**: `PaymentStrategy.java` – Allows different payment methods (credit card, PayPal) to be used interchangeably during checkout.

## **🛠️ Technologies Used**

- **Programming Languages**: Java, C#, TypeScript
- **Design Patterns**: Singleton Pattern, Factory Pattern, Adapter Pattern, Decorator Pattern, Observer Pattern, Strategy Pattern
- **Version Control**: Git

## **📋 Prerequisites**

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** (for Java implementation)
- **.NET SDK** (for C# implementation)
- **Node.js** (for TypeScript implementation)
- **Git**

## **🚀 Installation**

### **Clone the Repository**

```bash
git clone https://github.com/your-repo/design-patterns-showcase.git
Navigate to Project Directory
bash
Copy code
cd design-patterns-showcase
Compile and Run the Application
For Java
Compile the Java source files using:

bash
Copy code
javac -d bin src/**/*.java
Run the application using:

bash
Copy code
java -cp bin Main
For C#
Build the C# project using:

bash
Copy code
dotnet build
Run the application using:

bash
Copy code
dotnet run
For TypeScript
Compile the TypeScript files using:

bash
Copy code
tsc
Run the application using:

bash
Copy code
node dist/main.js
📚 Usage Instructions
Explore each design pattern implementation by following the provided example code in the corresponding language. Review the code to understand how each pattern is applied and how it can be used to solve specific design problems.

🛡️ Design Patterns Overview
Creational Patterns: Focus on object creation mechanisms, trying to create objects in a manner suitable to the situation.
Structural Patterns: Deal with object composition, creating relationships between objects to form larger structures.
Behavioral Patterns: Focus on communication between objects, defining how objects interact and communicate with each other.
📜 Code Structure
Main.java / Main.cs / main.ts: Entry point for the application, demonstrating various design patterns.
SingletonPattern.java / SingletonPattern.cs / SingletonPattern.ts: Implementation of the Singleton pattern.
FactoryPattern.java / FactoryPattern.cs / FactoryPattern.ts: Implementation of the Factory pattern.
AdapterPattern.java / AdapterPattern.cs / AdapterPattern.ts: Implementation of the Adapter pattern.
DecoratorPattern.java / DecoratorPattern.cs / DecoratorPattern.ts: Implementation of the Decorator pattern.
ObserverPattern.java / ObserverPattern.cs / ObserverPattern.ts: Implementation of the Observer pattern.
StrategyPattern.java / StrategyPattern.cs / StrategyPattern.ts: Implementation of the Strategy pattern.

🤝 Contributing
We welcome contributions to improve and extend the functionality of this showcase. Please fork the repository and submit a pull request with detailed information about your changes.

📜 License
This project is licensed under the MIT License. For more details, see the LICENSE file.

📧 Contact Information
For any inquiries or feedback, please reach out:

Email: theerajnjegan@gmail.com
GitHub: theerajn


