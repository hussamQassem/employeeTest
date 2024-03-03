/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employeetest;

import java.util.Scanner;

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

        manager mg= new manager("Gnomeo", "smurf");
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("please enter username");
            String userNameInput=sc.nextLine();
            System.out.println("enter password");
            String passwordInput=sc.nextLine();
            
            if(mg.getUsername().equals(userNameInput)&&mg.getPassword().equals(passwordInput)){
            
                System.out.println("login successful");

            
            while(true){
                System.out.println("menu\n choose option");
                System.out.println("1- view current staff");
                System.out.println("2- add new staff");
                System.out.println("3- logout");
            int option=sc.nextInt();
            
            switch (option){
            
                case 1:
                    System.out.println("current staff");
                case 2: 
                    System.out.println("add staff");
                case 3:
                    System.out.println("exit");

            }//end of switch

            } //end of while
            }
        
        
        }
        
        
        
    }
}
