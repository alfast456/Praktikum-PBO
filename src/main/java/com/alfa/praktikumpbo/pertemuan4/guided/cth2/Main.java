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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Blacky");
        Rabbit rabbit = new Rabbit("Bunny");
        
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        Animal garfield = new Cat("Garfield");
        garfield.showProfile();
    }
    
}
