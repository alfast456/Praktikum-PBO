/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan2.guided;

/**
 *
 * @author HP
 */
public class DemoManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];
        
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Alfa");
        manusia1.setUmur(19);
        
        Manusia manusia2 = new Manusia("Flinn");
        Manusia manusia3 = new Manusia("Darwin", 16);
        
        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;
        
        for (Manusia x : arrayManusia){
            System.out.println("Character ");
            System.out.println("Nama    : "+x.getNama());
            System.out.println("Umur    : "+x.getUmur());
        }
        // TODO code application logic here
    }
    
}
