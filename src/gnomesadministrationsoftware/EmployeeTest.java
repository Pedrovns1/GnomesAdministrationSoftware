/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadministrationsoftware;

/**
 *
 * @author peuvi
 */
public class EmployeeTest {

    public static void main(String[] args) {

        // Employee objects with specified details
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        //Array created to store employees
        Employee[] projectGroup = {emp1, emp2, emp3};

        System.out.println("Next Employee number: " + Employee.getNextEmpNum());

        // Loop to check and display the name of each employee loaded into the array
        int m = 0;
        for (Employee employee : projectGroup) {
            if (employee.getempNum() > m) {
                System.out.println("Employee name: " + employee.getName());
            }
        }

    }
}
