Virtual Classroom Management Application
Overview
The Virtual Classroom Management Application is a comprehensive solution for managing virtual classrooms, student enrollment, and assignment tracking. This Java-based application provides functionality for creating and managing classrooms, enrolling students, and handling assignments with a focus on scalability and maintainability.

Key Features
Classroom Management

Add and remove classrooms.
View a list of all classrooms.
Student Management

Add students to classrooms.
List students within a specific classroom.
Assignment Management

Schedule and remove assignments for classrooms.
Submit assignments by students, ensuring proper validation.
Installation
To set up and run the Virtual Classroom Management application, follow these steps:

Clone the Repository

bash
Copy code
git clone https://github.com/your-repo/virtual-classroom-management.git
Navigate to the Project Directory

bash
Copy code
cd virtual-classroom-management
Compile the Java Files

Ensure that you have the JDK installed. Compile the Java source files using:

bash
Copy code
javac -d bin src/*.java
Run the Application

Execute the application using:

bash
Copy code
java -cp bin src.Main
Usage Instructions
After launching the application, you will be presented with a menu. Here’s how to use each option:

Add a Classroom

Select option 1.
Enter the desired classroom name.
Remove a Classroom

Select option 2.
Provide the classroom name to be removed.
List Classrooms

Select option 3 to display all existing classrooms.
Add a Student

Select option 4.
Input the student ID and the classroom name.
List Students in a Classroom

Select option 5.
Enter the classroom name to view its students.
Schedule an Assignment

Select option 6.
Provide the classroom name and assignment details.
Remove an Assignment

Select option 7.
Enter the classroom name and assignment details.
Submit an Assignment

Select option 8.
Input the student ID, classroom name, and assignment details.
Exit the Application

Choose option 9 to exit.
Code Structure
Main.java: The main entry point of the application, handling user input and menu display.
VirtualClassroomManager.java: Central management for classrooms, students, and assignments. Implements core functionalities and business logic.
Classroom.java: Represents a classroom, manages assignments, and maintains assignment statuses.
Student.java: Represents a student, manages assignment submissions and tracks submitted assignments.
LoggerManager.java: Handles logging of application events and errors.
Design Patterns
The application employs several design patterns for effective solution design:

Singleton Pattern: Implemented in VirtualClassroomManager to ensure a single instance throughout the application.
Factory Pattern: Utilized in ClassroomFactory for creating classroom instances.
Observer Pattern: Applied via AssignmentSubject to notify about assignment changes.
Contributing
Contributions to enhance the functionality or address issues are welcome. Please fork the repository and submit a pull request with a detailed description of changes.

License
This project is licensed under the MIT License. For more details, see the LICENSE file.

Contact Information
For inquiries or feedback, please reach out via:

Email: theerajnjegan@gmail.com
GitHub: theerajn
