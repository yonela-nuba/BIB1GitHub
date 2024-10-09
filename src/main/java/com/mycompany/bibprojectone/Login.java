/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibprojectone;

/**
 *
 * @author ynuba
 */
public class Login {
    
    //This method checks the username if it contains the underscore and the length does not exceed 5
    public boolean CheckUsername(String username){
        return username.contains("_") && username.length()<=5;
    }
    
}
