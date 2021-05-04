/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan4.unguided;

/**
 *
 * @author HP
 */
public class Parent {
    private String bot;
    
    public Parent(String bot){
        this.bot = bot;
    }

    public String getBot() {
        return bot;
    }
    
    public String getChatbot(){
        return "Siape Lu...";
    }
    
    public String playChatbot(){
        return "maaf tidak menerima guy!";
    }
    
    public void showChat(){
        System.out.println("Halo " + getBot() 
                + " " + getChatbot() + ", " 
                + playChatbot());
    }
}
