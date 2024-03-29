/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author hussa
 */
// private Instance fields of the class employee
public class Employee {
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum=1;
    //constructor that initialises the name and email instance fields 
    public Employee(){
        this.name="default";
        this.email="example@example.com";
        this.empNum=nextEmpNum;
        Employee.nextEmpNum+=1;
    }
    
    //constructor initialises these fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum;
        Employee.nextEmpNum+=1;
    }
// setters and getters for the fileds
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmail(String email) {
        if(email.length()>3){
        
        this.email = email;}
        else{System.out.println("email length should be more than 3 characters");}
    }

    public static int getNextEmpNum() {
        return nextEmpNum;
    }
    //adding tostring method to check the class
    @Override
    public String toString() {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nEmployee Number: " + this.empNum;
    }
}
