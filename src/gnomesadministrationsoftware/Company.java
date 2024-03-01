/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadministrationsoftware;

/**
 *
 * @author peuvi
 */
public class Company {
    
    private String companyName;
    private ArrayList<Employee> staff;

    //Constructor for the company 
    public Company() {
        this.companyName = companyName;
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
    
   
}
