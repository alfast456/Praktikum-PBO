/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan5.unguided;

/**
 *
 * @author HP
 */
public class botChat {
    String bot;
    
    // contructor botChat
    public botChat(String bot){
        this.bot = bot;
    }
    
    // method memasak (original)
    public void showChat(){
        System.out.println("Halo " + bot 
                + " Sedang chat sama yang lain !");
    }
    
    // method memasak (overloaded)
    public void showChat(String namaBot){
        System.out.println("Halo " + bot 
                + " Sedang chat sama mbak " + namaBot);
    }
}
