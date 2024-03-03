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
        int m=2;
        Employee emp1=new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2= new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3= new Employee("Tom Thumb", "tt@gmail.com");
        Employee[] projectGroup = {emp1, emp2, emp3};
        Company co = new Company();
        co.addNewStaff(emp1);
        co.addNewStaff(emp2);
        co.addNewStaff(emp3);
        
        System.out.println("Value of nextEmpNum: " + Employee.getNextEmpNum());

        System.out.println("Employees with Employee Number above " + m );
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }

        Manager mg= new Manager("Gnomeo", "smurf");
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
                    co.listEmployees(m);
                    break;
                case 2: 
                  System.out.println("add employee name");
                  String newEmpName=sc.next();
                  System.out.println("add employee email");
                  String newEmpEmail=sc.next();
                  Employee newEmp= new Employee(newEmpName,newEmpEmail);
                  co.addNewStaff(newEmp);
                  System.out.println("new employee added");
                  break;
                case 3:
                    System.out.println("exit");
                    break;
                default :
                    System.out.println("please enter valed option");

            }//end of switch

            } //end of while
            }
            else{
                System.out.println("something wrong, invaled username or password");
            }
        
        
        }
        
        
        
    }
}
