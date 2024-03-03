/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadministrationsoftware;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 
 * @author peuvi
 */
//https://github.com/Pedrovns1/GnomesAdministrationSoftware
public class EmployeeTest {

    public static void main(String[] args) {

        // Employee objects with specified details
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        //Array created to store employees
        Employee[] projectGroupArray = {emp1, emp2, emp3};

        System.out.println("Next Employee number: " + Employee.getNextEmpNum());

        // Loop to check and display the name of each employee loaded into the array
        int m = 0;
        for (Employee employee : projectGroupArray) {
            if (employee.getempNum() > m) {
                System.out.println("Employee: " + employee.getName() + "\nEmployee Number:" + employee.getempNum());
            }
        }

        // This will add the employees to the ArrayList for use in other parts of the code
        ArrayList<Employee> projectGroupList = new ArrayList<>(Arrays.asList(projectGroupArray));

        // Instantiate a manager for testing
        Manager manager = new Manager();
        Company company = new Company("Gnomes Administration");

        // This code will add the employees to the Company for functionality testing
        for (Employee emp : projectGroupList) {
            company.addNewStaff(emp);
        }

      
        // This will call the method that initiates the manager's menu
        GnomesAdministrationSoftware.startMenu(manager, company);
    }
}
