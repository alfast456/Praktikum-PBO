/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan6.guided.agregasi;

/**
 *
 * @author HP
 */
public class Dosen {
    private String NIDN;
    private String Nama;
    
    public Dosen(String nidn, String nama){
        this.NIDN=nidn;
        this.Nama=nama;
    }

    public String getNIDN() {
        return NIDN;
    }

    public String getNama() {
        return Nama;
    }
}
