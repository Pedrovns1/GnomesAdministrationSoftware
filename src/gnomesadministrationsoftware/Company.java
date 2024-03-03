/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadministrationsoftware;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author peuvi
 */
public class Company {

    private String companyName;
    private ArrayList<Employee> staff;

    //Constructor for the company 
    public Company() {
        this.companyName = "CompanyName";
        this.staff = staff;
    }

    //Overloaded constructor to get a name as a parameter
    public Company(String name) {
        this.companyName = name;
        this.staff = new ArrayList<>();
    }

    // Method created to add a new employee to the ArrayList
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }

    // Method created to get the number of employee in the ArrayLIst
    public int getStaffNumber() {
        return staff.size();
    }

    // Method to get a staff in the ArrayList
    public ArrayList<Employee> getStaff() {
        return staff;
    }

    //Method to display employees whose employee numbers are greater than the provided parameter.
    public void listEmployees(int employeeNumber) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getempNum() > employeeNumber) {
                System.out.println("Employee name: " + employee.getName());
            }
        }
    }

    // Method to remove the employee  from the ArrayList using the empNum as parameter
    public void removeStaff(int empNum) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getempNum() == empNum) {
                iterator.remove();
                System.out.println("Employee with empNum " + empNum + " removed successfully.");
                return;
            }
        }
        //Message if the employee is not found based on the provided empNum
        System.out.println("Employee with empNum " + empNum + " not found.");
    }

}
