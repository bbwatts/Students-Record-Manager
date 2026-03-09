import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenuRecursive();
    }

    private static void displayMenuRecursive() {
        System.out.println("--- Student Records Manager ---");
        System.out.println("1. Add Student");
        System.out.println("2. List All");
        System.out.println("3. Search by ID");
        System.out.println("4. Search by Name");
        System.out.println("5. Update");
        System.out.println("6. Remove");
        System.out.println("7. Sort by ID");
        System.out.println("8. Sort by Name");
        System.out.println("9. View Statistics");
        System.out.println("10. Quit");
        System.out.print("Choose an option: ");

        int choice = getValidMenuChoice();

        switch (choice) {
            case 1: addStudent();
            case 2: listAll();
            case 3: searchById();
            case 4: searchByName();
            case 5: updateStudent();
            case 6: removeStudent();
            case 7: sortById();
            case 8: sortByName();
            case 9: viewStatistics();
            case 10: System.out.println("Exiting..."); 
                    return; // Exit the recursion
            default: System.out.println("Invalid choice. Please try again.");
        }

        displayMenuRecursive(); // Repeat the menu
    }

    private static int getValidMenuChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 10) {
                    return choice;
                } else {
                    System.out.println("Choice must be between 1 and 10.");
                }
            } else {
                System.out.println("Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Placeholder methods for menu options
    private static void addStudent() { /* Implementation */ }
    private static void listAll() { /* Implementation */ }
    private static void searchById() { /* Implementation */ }
    private static void searchByName() { /* Implementation */ }
    private static void updateStudent() { /* Implementation */ }
    private static void removeStudent() { /* Implementation */ }
    private static void sortById() { /* Implementation */ }
    private static void sortByName() { /* Implementation */ }
    private static void viewStatistics() { /* Implementation */ }

    // Student class for demonstration purposes
    private static class Student {
        private String id;
        private String name;

        // Constructor, getters, and setters
    }
}