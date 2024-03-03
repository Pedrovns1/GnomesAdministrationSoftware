/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gnomesadministrationsoftware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author peuvi
 */
public class GnomesAdministrationSoftware {
    // Constants for valid username and password to give access
    private static final String USERNAME = "Gnomeo";
    private static final String PASSWORD = "smurf";

    // Method to check if the entered username and password match the manager's credentials
    private static boolean isAuthenticated(Manager manager, String enteredUsername, String enteredPassword) {
        return manager.getUsername().equals(enteredUsername) && manager.getPassword().equals(enteredPassword);
    }
    
    // Method to display menu options for the manager     
    private static void displayMenu() {
        System.out.println("Enter your choice:");
        System.out.println("1. View current staff");
        System.out.println("2. Add new staff");
        System.out.println("3. Remove staff");
        System.out.println("4. Logout");
    }

    public static void executeMenu(Company company, Manager manager, Scanner scanner) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    viewCurrentStaff(company);
                    break;
                case 2:
                    addNewStaff(company, scanner);
                    break;
                case 3:
                    removeStaff(company, scanner);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void viewCurrentStaff(Company company) {
        System.out.println("Current Staff:");
        for (Employee employee : company.getStaff()) {
            System.out.println("Employee name: " + employee.getName()+ "\nEmployee Number:" + employee.getempNum());
        }
    }

    //Method to add new staffs to the system
    private static void addNewStaff(Company company, Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();
        Employee newEmployee = new Employee(name, email);
        company.addNewStaff(newEmployee);
        System.out.println("New staff added successfully.");
    }
    //Method to remove staffs from the system
    private static void removeStaff(Company company, Scanner scanner) {
        System.out.print("Enter empNum of the employee to remove: ");
        int empNum = scanner.nextInt();
        company.removeStaff(empNum);
    }

    // Method tha will inicialize the manager's menu and get the username and password to validat the login
    public static void startMenu(Manager manager, Company company) {
        System.out.println("Welcome to the Manager Console Menu");
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt for username and password
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (manager != null && isAuthenticated(manager, enteredUsername, enteredPassword)) {
                executeMenu(company, manager, scanner);
            } else {
                System.out.println("Invalid username or password. Exiting...");
            }
        }
    }
}