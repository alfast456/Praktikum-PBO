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
public class Mobil {
    Roda roda;
    String warna;
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public void setRoda(String m, int r){
        roda=new Roda(m,r);
    }
    public String getMerkRoda(){
        return roda.getMerk();
    }
    public int getRingRoda(){
        return roda.getRing();
    }
}
