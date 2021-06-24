/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan7.guided;

/**
 *
 * @author HPS
 */
public class Basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myNumbers = {1,2,3};
        
        try{
            System.out.println(myNumbers[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Array tidak sebesar itu!");
        }
    } 
}
