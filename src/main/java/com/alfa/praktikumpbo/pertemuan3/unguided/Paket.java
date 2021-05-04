/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.unguided;

/**
 *
 * @author HP
 */
public class Paket {
    
    private String hosting;
    private int harga;
    private String keterangan;
    private int total = 0;
    
    public Paket(String hosting, int harga, String keterangan){
        this.hosting = hosting;
        this.harga = harga;
        this.keterangan = keterangan;
    }

    public String getHosting() {
        return hosting;
    }

    public int getHarga() {
        return harga;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public String showDetail(){
        return getHosting() + " Rp." + getHarga() 
                + " (" + getKeterangan() + ")";
    }
}
