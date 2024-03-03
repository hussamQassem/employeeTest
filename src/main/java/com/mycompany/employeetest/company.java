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
public class company {
    private String companyName;
    private ArrayList<employee> staff;
   

public company(){
        this.companyName = "Default Company";
        this.staff = new ArrayList<>();


}
    public company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    //creating method that we can add nre employees
 public void addNewStaff(employee employee) {
        staff.add(employee);
    }
    // creating method to get the number of employees currently in the staff ArrayList
    public int getStaffNumber() {
        return staff.size();
    }

 public void listEmployees(int empNum) {
        System.out.println("Employees with employee number above " + empNum );
        Iterator<employee> iter = staff.iterator();
        while (iter.hasNext()) {
            employee emp = iter.next();
            if (emp.getEmpNum() > empNum) {
                System.out.println(emp.getName());
            }
        }
    }







}