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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array of object of inherited classes
        Animal[] habitat = {
            new Cat("Miyu"),
            new Dog("Dogmeat"),
            new Rabbit("Song")
        };
        
        // output (cara1)
        int animalCount = habitat.length;
        for(int i=0; i<animalCount; i++){
            habitat[i].showProfile();
        }
        
        // cara 2
        for(Animal animal : habitat)
            animal.showProfile();
    }
    
}
