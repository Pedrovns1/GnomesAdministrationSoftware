/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadministrationsoftware;

/**
 *
 * @author peuvi
 */
public class Employee {

    private String name;
    private String email;
    private int empNum;
    private static int nextempNum = 1;
   
    // Default constructor 
    public Employee() {
        this.name = "Name";
        this.email = "Default@gnomes.com";
        //nextempNum++ will auto increment to ensure a unique employee
        this.empNum = nextempNum++;
    }
    
    // Parametrized contructor with email validation
    public Employee(String name, String email) {
        this.name = name;
        
        // Validate email using Emailvalidation class
        if (EmailValidation.isValidEmail(email)){
        this.email=email;
        }else{
            // If the email is invalid this will ensure that the default email will be implemented
            System.out.println("Invalid email. Setting default email");
            System.out.println("Please change this default email to a valid one");
            this.email = email;
        }
        this.empNum = empNum;
    }

}
