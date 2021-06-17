/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan6.unguided.komposisi;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Handphone hp1 = new Handphone("ASUS", "ROG RGB Phone");
        hp1.komponen(new Harga("12.000.000"));

        Handphone hp2 = new Handphone("Xiaomi", "BlackShark 3");
        hp2.komponen(new Harga("10.000.000"));

        Handphone hp3 = new Handphone("IPhone", "7+");
        hp3.komponen(new Harga("6.500.000"));
        
        System.out.println("\t HARFA CELLULER \t\t");
        System.out.println("\t DAFTAR HARGA HP \t");
        System.out.println("");
        
        hp1.tampilData();
        hp2.tampilData();
        hp3.tampilData();
    }
}
