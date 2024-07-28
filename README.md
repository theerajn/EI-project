# **📚 Virtual Classroom Management Application**

Welcome to the **Virtual Classroom Management Application**! This powerful Java-based solution offers a complete set of tools for managing virtual classrooms, including student enrollment, assignment scheduling, and more. Designed with robust features and a user-friendly interface, this application is ideal for educators and administrators seeking efficient classroom management.

## **🎯 Key Features**

- **Classroom Management**:
  - Add and remove classrooms effortlessly.
  - View and manage all existing classrooms.

- **Student Management**:
  - Enroll students into classrooms.# **📚 Virtual Classroom Management Application**

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
git clone https://github.com/theerajn/ei-project.git
Navigate to Project Directory
bash
Copy code
cd project_ei
Compile the Java Files
Ensure that you have the JDK installed. Compile the Java source files using:

bash
Copy code
javac -d bin src/exercise2/*.java
Run the Application
Execute the application using:

bash
Copy code
java -cp bin exercise2.Main
📚 Usage Instructions
Once the application is running, follow the console prompts to manage your virtual classroom:

Add a Classroom:

Input the desired classroom name.
Remove a Classroom:

Provide the classroom name to be removed.
List Classrooms:

Display all existing classrooms.
Add a Student:

Enter the student ID and the classroom name.
List Students in a Classroom:

View all students within a specified classroom.
Schedule an Assignment:

Input the classroom name and assignment details.
Remove an Assignment:

Enter the classroom name and the assignment details to be removed.
Submit an Assignment:

Provide the student ID, classroom name, and assignment details.
Exit the Application:

Choose this option to exit.
🛡️ Design Patterns
This application employs several design patterns to ensure efficiency and maintainability:

Singleton Pattern
Ensures a single instance of the VirtualClassroomManager for consistent management.

Factory Pattern
Simplifies the creation of Classroom instances.

Observer Pattern
Monitors and notifies changes in assignment scheduling and status.

📜 Code Structure
Main.java: Entry point for the application, managing user input and interaction.
VirtualClassroomManager.java: Central management for classrooms and students, handling core functionalities.
Classroom.java: Represents a classroom, managing assignments and notifying observers.
Student.java: Manages student details and assignment submissions.
LoggerManager.java: Provides custom logging for auditing actions and events.
ClassroomFactory.java: Factory class for creating classroom instances.
🤝 Contributing
We welcome contributions to improve and extend the functionality of this application. Please fork the repository and submit a pull request with detailed information about your changes.

📜 License
This project is licensed under the MIT License. For more details, see the LICENSE file.

📧 Contact Information
For any inquiries or feedback, please reach out:

Email: theerajnjegan@gmail.com
GitHub: theerajn
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
git clone https://github.com/theerajn/ei-project.git
Navigate to Project Directory
bash
Copy code
cd project_ei
Compile the Java Files
Ensure that you have the JDK installed. Compile the Java source files using:

bash
Copy code
javac -d bin src/exercise2/*.java
Run the Application
Execute the application using:

bash
Copy code
java -cp bin exercise2.Main
📚 Usage Instructions
Once the application is running, follow the console prompts to manage your virtual classroom:

Add a Classroom:

Input the desired classroom name.
Remove a Classroom:

Provide the classroom name to be removed.
List Classrooms:

Display all existing classrooms.
Add a Student:

Enter the student ID and the classroom name.
List Students in a Classroom:

View all students within a specified classroom.
Schedule an Assignment:

Input the classroom name and assignment details.
Remove an Assignment:

Enter the classroom name and the assignment details to be removed.
Submit an Assignment:

Provide the student ID, classroom name, and assignment details.
Exit the Application:

Choose this option to exit.
🛡️ Design Patterns
This application employs several design patterns to ensure efficiency and maintainability:

Singleton Pattern: Ensures a single instance of the VirtualClassroomManager for consistent management.
Factory Pattern: Simplifies the creation of Classroom instances.
Observer Pattern: Monitors and notifies changes in assignment scheduling and status.
📜 Code Structure
Main.java: Entry point for the application, managing user input and interaction.
VirtualClassroomManager.java: Central management for classrooms and students, handling core functionalities.
Classroom.java: Represents a classroom, managing assignments and notifying observers.
Student.java: Manages student details and assignment submissions.
LoggerManager.java: Provides custom logging for auditing actions and events.
ClassroomFactory.java: Factory class for creating classroom instances.

🤝 Contributing
We welcome contributions to improve and extend the functionality of this application. Please fork the repository and submit a pull request with detailed information about your changes.

📜 License
This project is licensed under the MIT License. For more details, see the LICENSE file.
## **Design Patterns Implementation**

This project demonstrates the implementation of various design patterns in Java. Below are the use cases and details for each pattern implemented in this repository.

### **📜 1. Prototype Pattern - Document Editor**

#### **Use Case**
A document editor is implemented where users can create new documents by cloning a pre-defined template. This pattern allows us to copy existing documents, preserving their formatting and content, to create new ones.

#### **Files**
- `Document.java` - Defines the document structure.
- `DocumentTemplate.java` - Provides predefined document templates.
- `Editor.java` - Manages user interactions to create and edit documents.
- `Main.java` - Entry point of the application.

#### **Key Classes**
- **`Document`**: Base class representing a document.
- **`DocumentTemplate`**: Provides default content for new documents.
- **`Editor`**: Handles document creation and editing.

---

### **🗂️ 2. Composite Pattern - File System**

#### **Use Case**
A file system is implemented where files and directories are represented as components. Operations like reading, writing, or deleting can be performed on both individual files and entire directories.

#### **Files**
- `Component.java` - Abstract component class for files and directories.
- `File.java` - Represents a file.
- `Directory.java` - Represents a directory containing other components.
- `FileSystem.java` - Manages user interactions with the file system.
- `Main.java` - Entry point of the application.

#### **Key Classes**
- **`Component`**: Abstract class for file system components.
- **`File`**: Represents a file with read and write operations.
- **`Directory`**: Represents a directory containing other files or directories.
- **`FileSystem`**: Handles user interactions for file operations.

---

### **💳 3. Factory Pattern - Payment Gateway System**

#### **Use Case**
A payment gateway system is implemented where different factories handle different payment methods (e.g., credit cards, cryptocurrencies, bank transfers). The factory pattern is used to create different payment methods.

#### **Files**
- `PaymentMethod.java` - Interface for payment methods.
- `PaymentFactory.java` - Abstract factory for creating payment methods.
- `CreditCardFactory.java` - Factory for creating credit card payments.
- `CreditCardPayment.java` - Represents credit card payment.
- `CryptocurrencyFactory.java` - Factory for creating cryptocurrency payments.
- `CryptocurrencyPayment.java` - Represents cryptocurrency payment.
- `BankTransferFactory.java` - Factory for creating bank transfer payments.
- `BankTransferPayment.java` - Represents bank transfer payment.
- `PaymentProcessor.java` - Manages user interactions for processing payments.
- `Main.java` - Entry point of the application.

#### **Key Classes**
- **`PaymentMethod`**: Interface for payment methods.
- **`PaymentFactory`**: Abstract class for factories creating payment methods.
- **`PaymentProcessor`**: Handles user interactions for payment processing.

---

### **🔐 4. Proxy Pattern - Security Proxy**

#### **Use Case**
A security proxy is implemented to handle authentication and authorization checks before allowing access to sensitive data. This pattern provides a way to control access to an object by using a proxy.

#### **Files**
- `Data.java` - Interface for sensitive data.
- `RealData.java` - Actual implementation of sensitive data.
- `DataProxy.java` - Proxy that controls access to the `RealData` object.
- `Main.java` - Entry point of the application.

#### **Key Classes**
- **`Data`**: Interface for sensitive data operations.
- **`RealData`**: Represents the actual sensitive data.
- **`DataProxy`**: Proxy that performs access control.

---

### **📁 5. Composite Pattern - Enhanced File System**

#### **Use Case**
An enhanced file system where files and directories are managed as components with additional functionality for operations such as reading, writing, and deleting, adhering to the Composite design pattern.

#### **Files**
- `Component.java` - Abstract component class defining common methods for files and directories.
- `File.java` - Represents a file with specific read and write operations.
- `Directory.java` - Represents a directory that can contain files and other directories.
- `FileSystem.java` - Manages the file system interactions and operations.
- `Main.java` - Entry point of the application.

#### **Key Classes**
- **`Component`**: Abstract class for both files and directories.
- **`File`**: Handles file-specific operations.
- **`Directory`**: Manages a collection of components (files or directories).
- **`FileSystem`**: Provides the user interface for interacting with the file system.

---

### **🌟 6. State Pattern - Document Workflow**

#### **Use Case**
A document workflow system is implemented where documents go through various states (e.g., Draft, Review, Approved, Archived). The state pattern is used to manage transitions between these states.

#### **Files**
- `Document.java` - Manages the current state of the document.
- `DocumentState.java` - Abstract class for different document states.
- `DraftState.java` - State for draft documents.
- `ReviewState.java` - State for documents under review.
- `ApprovedState.java` - State for approved documents.
- `ArchivedState.java` - State for archived documents.
- `Main.java` - Entry point of the application.

#### **Key Classes**
- **`DocumentState`**: Abstract class for document states.
- **`DraftState`, `ReviewState`, `ApprovedState`, `ArchivedState`**: Concrete states managing specific document behaviors.


📧 Contact Information
For any inquiries or feedback, please reach out:

Email: theerajnjegan@gmail.com
GitHub: theerajn
