/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hussa
 */
public class Company{
    private String companyName;
    private ArrayList<Employee> staff;
   

  public Company(){
    this.companyName = "Default Company";
    this.staff = new ArrayList<>();


}
  public Company(String companyName) {
    this.companyName = companyName;
    this.staff = new ArrayList<>();
    }
    //creating method that we can add nre employees
  public void addNewStaff(Employee employee) {
    staff.add(employee);
    }
    // creating method to get the number of employees currently in the staff ArrayList
  public int getStaffNumber() {
    return staff.size();
    }

  public void listEmployees(int empNum) {
    if (staff.size() <= empNum) {
        System.out.println("There are no employees with a number higher than: " + empNum);
        return;
    }  
    
    System.out.println("Employees with employee number above " + empNum );
    Iterator<Employee> iter = staff.subList(empNum, staff.size()).iterator();
        while (iter.hasNext()) {
            Employee emp = iter.next();
            System.out.println(emp.getName());
        }
    }

    @Override
    public String toString() {
        return "Company Name: " + this.companyName + "\nList Employees: " + this.staff;
    }
}