/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadministrationsoftware;

/**
 *
 * @author peuvi
 */

// Manager class extends the functionality of the Employee class
public class Manager extends Employee {

    private String username;
    private String password;

    // Constructor for Manager with default values
    public Manager() {
        // Call the default constructor in the Employee class to ensure it initializes first
        super(); 
        this.username = "Gnomeo";
        this.password = "smurf";
    }

    // Getter method for username
    public String getUsername() {
        return username;
    }

    // Getter method for password
    public String getPassword() {
        return password;
    }
}
