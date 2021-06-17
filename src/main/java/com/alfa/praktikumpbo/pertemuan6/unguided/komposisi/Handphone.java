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
public class Handphone {

    String merk;
    String seri;
    Harga harga;

    public Handphone(String merk, String seri) {
        this.merk = merk;
        this.seri = seri;
    }

    public void komponen(Harga harga) {
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("Handphone " + this.merk + " Seri " + this.seri);
        System.out.print("Harga: Rp.");
        System.out.println(harga.getNominal());
        System.out.println(" ");
    }
}
