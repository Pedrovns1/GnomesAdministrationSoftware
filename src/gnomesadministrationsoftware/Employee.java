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
    private static int nextEmpNum = 1;
   
    // Default constructor 
    public Employee() {
        // Will initialize with default values
        this.name = "Name";
        this.email = "Default@gnomes.com";
        //nextempNum++ will auto increment to ensure a unique employee
        this.empNum = nextEmpNum++;
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
        // Initialize empNum with the next available employee number
        this.empNum = nextEmpNum++;
    }
  
   // Name getter method
   public String getName() {
     return name;
   }
   
   // Email getter method
   public String getEmail() {
     return email;
   }
    
   // Employee number getter method
   public int getempNum () {
     return empNum;
   }

   // Email setter method using the regex pattern validation
   public void setEmail (String email) {
     if (EmailValidation.isValidEmail(email)) {
       this.email = email;
     }else {
         // If the new email isn't valid the email will not be updated 
         System.out.println("Invalid email. Email not updated");
     }
   }
   
   // Method to get the nex employee number available
   public static int getNextEmpNum() {
        return nextEmpNum;
    }
}
