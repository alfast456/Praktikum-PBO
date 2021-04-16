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
public class Manusia {
    private String nama;
    private int umur;
    
    //contruct pertama tanpa parameter
    public Manusia(){}
    
    //kontstruk ke 2
    public Manusia(String nama){
        this.nama = nama;
    }
    //konstruk ketiga
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    //definisi method
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
}
