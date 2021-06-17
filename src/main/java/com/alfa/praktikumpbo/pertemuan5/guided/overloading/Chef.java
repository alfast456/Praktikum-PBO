/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan5.guided.overloading;

/**
 *
 * @author HP
 */
public class Chef {
    String nama;
    
    // Constructor Chef
    public Chef(String nama){
        this.nama = nama;
    }
    
    // Method memasak (original)
    public void memasak(){
        System.out.println("Chef " + nama + " sedang memasak "
                + "sesuatu!");
    }
    
    // Method memasak (overloaded)
    public void memasak(String namaMakanan){
        System.out.println("Chef " + nama + " sedang memasak " 
                + namaMakanan);
    }
}

