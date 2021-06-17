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
public class Roda {
    private String merk;
    private int ring;
    public Roda(String merk, int ring){
        this.merk = merk;
        this.ring = ring;
    }
    public String getMerk(){
        return merk;
    }
    public int getRing(){
        return ring;
    }
}
