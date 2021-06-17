/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan6.guided.komposisi;

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
        Mobil mobil=new Mobil();
        mobil.setWarna("Biru");;
        mobil.setRoda("Micheline", 17);
        
        System.out.println("Warna mobil : "+mobil.getWarna());
        System.out.println("Merk roda mobil : "+mobil.getMerkRoda());
        System.out.println("Ukuran ring roda : "+mobil.getRingRoda());
    }
    
}
