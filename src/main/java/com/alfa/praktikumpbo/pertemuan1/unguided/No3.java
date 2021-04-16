/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan1.unguided;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coba=1;
        while(coba<4){
            System.out.print("Username : ");
            String username = input.nextLine();
            
            System.out.print("Password : ");
            String password = input.nextLine();

            if(coba <= 3){
                if("admin".equals(username) && "admin".equals(password)){
                    System.out.println("Login successful!");
                    break;
                }else{
                    System.out.println("Login failed!("+coba+"/3)");
                    if(coba == 3){
                        System.out.println("You have been blocked!");
                        break;
                    }
                }
            }coba++; 
        }
    }
}
