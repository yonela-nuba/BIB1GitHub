/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibprojectone;

/**
 *
 * @author ynuba
 */
public class BIBProjectOne {

    public static void main(String[] args) {
        
        //
        int a = 5;        
        int b = 10;
        int c = a+b;
        System.out.println(c);
        
        //Creating an object of a class
        Login login = new Login();
        //Checking the method if it works
        System.out.println(login.CheckUsername("Yon_"));
    }
}
