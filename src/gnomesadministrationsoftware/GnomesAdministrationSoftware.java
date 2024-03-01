/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gnomesadministrationsoftware;

/**
 *
 * @author peuvi
 */
public class GnomesAdministrationSoftware {
    
    // Constants for valid username and password to give access
    private static final String USERNAME = "Gnomeo";
    private static final String PASSWORD = "smurf";
    
    
    // Method to handle the manager Login
    private static boolean isAuthenticated(Manager manager, String enteredUsername, String enteredPassword) {
        return manager.getUsername().equals(enteredUsername) && manager.getPassword().equals(enteredPassword);
    }   
    
    // Method to display menu options for the manager
    private static void displayMenu() {
        System.out.println("Menu");
        System.out.println("Enter your choice:");
        System.out.println("1. View current staff");
        System.out.println("2. Add new staff");
        System.out.println("3. Remove staff");
        System.out.println("4. Logout");
    }
    
}
