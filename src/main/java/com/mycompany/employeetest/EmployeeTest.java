/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employeetest;

/**
 *
 * @author hussam
 */
public class EmployeeTest {

    public static void main(String[] args) {
        int m=1;
        employee emp1=new employee("Joe Bloggs", "jb@gmail.com");
        employee emp2= new employee("Ann Banana", "ab@gmail.com");
        employee emp3= new employee("Tom Thumb", "tt@gmail.com");
        employee[] projectGroup = {emp1, emp2, emp3};
        company co = new company();
        
        
        System.out.println("Value of nextEmpNum: " + employee.getNextEmpNum());
        
        
        System.out.println("Employees with Employee Number above " + m );
        for (employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }
        
        
        
    }
}
