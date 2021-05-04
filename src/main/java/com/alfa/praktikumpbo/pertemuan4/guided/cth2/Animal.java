/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan4.guided.cth2;

/**
 *
 * @author HP
 */
public class Animal {
    private String name;
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getType(){
        return "Unknown";
    }
    
    public String playSound(){
        return "Error: unknown animal type!";
    }
    
    public void showProfile(){
        System.out.println("Name : " + getName());
        System.out.println("Type : " + getType());
        System.out.println("Sound : " + playSound());
        System.out.println();
    }
}
