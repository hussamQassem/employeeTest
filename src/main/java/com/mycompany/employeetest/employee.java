/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author hussa
 */
public class employee {
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum=1;
    
    public employee(){
        this.name="default";
        this.email="example@example.com";
        this.empNum=nextEmpNum++;
   
    }
    public employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }

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
    
 
}
