# Student Records Manager

## Project Description
Student Records Manager is a console-based Java application that demonstrates core computer science concepts including object-oriented programming (OOP), data structures, recursion, and software design principles. The program stores and manages a list of student records with functionality to add, view, search, update, and remove students.

## How to Run the Program
1. Ensure you have Java installed on your system (Java 8 or later recommended)
2. Compile all Java files:
   ```
   javac Student.java StudentManager.java Main.java
   ```
3. Run the program:
   ```
   java Main
   ```
4. Follow the on-screen menu prompts to manage student records

## Features Implemented
- **Add a Student**: Add new student records with ID, name, and GPA (prevents duplicate IDs)
- **List All Students**: Display all stored student records
- **Search by Student ID**: Find a specific student using their unique ID
- **Search by Last Name**: Find all students matching a last name
- **Update Student Information**: Modify an existing student's first name, last name, or GPA
- **Remove a Student**: Delete a student record from the system
- **Sort Students by ID**: Sort records in ascending order by Student ID
- **Sort Students by Last Name**: Sort records in ascending order by last name
- **View Statistics**: Calculate and display average GPA, highest GPA, and count students above a threshold
- **Input Validation**: Prevents duplicate IDs, handles non-numeric input, and validates empty fields

## Where Recursion Is Used and Why
Recursion is implemented in multiple locations for educational purposes:

1. **Menu Re-prompt Method** (`displayMenuRecursive()`): Uses recursion to repeat the menu loop until the user chooses to quit. This demonstrates how recursion can be used as an alternative to loops for iteration.

2. **Sorting Methods** (`recursiveSortById()`, `recursiveSortByLastName()`): Implements selection sort recursively, sorting one element at a time with each recursive call. The base case is when the index reaches the end of the list.

3. **Statistics Methods** (`recursiveAverageGpa()`, `recursiveHighestGpa()`, `recursiveCountAboveGpa()`): These methods recursively traverse the student list to compute values. They demonstrate accumulator patterns and how recursion can be used for data aggregation.

Each recursive method includes a clear base case to prevent infinite recursion and meaningful recursive calls that move toward the base case.

## Data Structures
- **ArrayList<Student>**: Used in StudentManager to dynamically store and manage student records, allowing efficient insertion and removal operations.
- **Student Class**: Encapsulates student data with private fields and public accessors, demonstrating proper OOP design.

## Object-Oriented Design
- **Student Class**: Represents a student entity with fields for ID, name, and GPA
- **StudentManager Class**: Manages the collection of students and implements business logic for operations
- **Main Class**: Provides the user interface and coordinates user input with the StudentManager

This separation of concerns demonstrates good OOP principles with clear responsibility division.