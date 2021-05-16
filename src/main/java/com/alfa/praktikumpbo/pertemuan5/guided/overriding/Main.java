/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan5.guided.overriding;

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
        Hewan a = new Hewan();
        Hewan b = new Kucing();
        
        a.nama();//memanggil method di kelas hewan
        b.nama();//memanggil method dikelas kucing
    }
    
}
