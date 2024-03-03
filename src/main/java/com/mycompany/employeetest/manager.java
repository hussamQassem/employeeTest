/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author hussa
 */
public class manager extends employee{
    
    private String username;
    private String password;
    // Constructor with default values
    public manager() {
      
        this.username = "Gnomeo";
        this.password = "smurf";
    }
    
    public manager( String username, String password) {
       
        this.username = username;
        this.password = password;
    }
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
