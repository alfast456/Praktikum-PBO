/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan2.unguided;

/**
 *
 * @author HP
 */
public class classNomor2 {
    private String nama;
    private String vision;
    
    //Constructor pertama default tanpa parameter
    public classNomor2(){
        this.nama = "no name";
        this.vision = "no vision";
    }
    
    //Constructor kedua
    public classNomor2(String nama){
        this.nama = nama;
        this.vision = "no vision";
    }
    
    //Constructor ketiga
    public classNomor2(String nama, String vision){
        this.nama = nama;
        this.vision = vision;
    }
    
    //Difinisi Methode
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getVision(){
        return vision;
    }
    
    public void setVision(String vision){
        this.vision = vision;
    }
}