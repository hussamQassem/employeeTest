/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author hussa
 */
//creating a manager class that extend employee class with username and password as fields
public class Manager extends Employee{
    
        private String username;
        private String password;
    // Constructor with default values
    public Manager() {
      
        this.username = "Gnomeo";
        this.password = "smurf";
    }
    
    public Manager( String username, String password) {
       
        this.username = username;
        this.password = password;
    }
    //setters and getters for all the fields
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
