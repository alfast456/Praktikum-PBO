/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.guided.restaurant;

/**
 *
 * @author HP
 */
public class Item {

    private String nama;
    private int harga;
    private String jenis;
    
    public Item(String nama, int harga, String jenis){
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }
    
    public String showDetail(){
        return getNama() + "(" + getJenis() + ")- Rp" + getHarga();
    }
}
