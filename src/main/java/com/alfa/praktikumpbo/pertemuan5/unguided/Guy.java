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
public class Guy extends botChat{

    public Guy(String bot) {
        super(bot);
    }
    public void showChat() {
        System.out.println("Anda Sedang chat dengan " + bot);
    }
    
}
