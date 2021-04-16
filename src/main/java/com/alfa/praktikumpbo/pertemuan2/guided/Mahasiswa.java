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
public class Mahasiswa {
    String nama;
    int nim;
    
    public Mahasiswa(){}
    public Mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void SetNama(String nama) {
        this.nama = nama;
    }
    
    public int getNim(){
        return nim;
    }
    
    public void setNim(int nim){
        this.nim = nim;
    }
    
}
