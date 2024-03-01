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
        
        employee emp1=new employee("Joe Bloggs", "jb@gmail.com");
        employee emp2= new employee("Ann Banana", "ab@gmail.com");
        employee emp3= new employee("Tom Thumb", "tt@gmail.com");
        employee[] projectGroup = {emp1, emp2, emp3};
        
        System.out.println("Value of nextEmpNum: " + employee.getNextEmpNum());
    }
}
