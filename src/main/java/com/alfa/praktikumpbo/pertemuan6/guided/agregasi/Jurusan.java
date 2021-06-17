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
public class Jurusan {
    private String namaJurusan;
    private Dosen dosen;
    
    public Jurusan(String namaJurusan){
        this.namaJurusan=namaJurusan;
    }


    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    public Dosen getDosen(){
        return  dosen;
    }
    public String getNamaJurusan(){
       return namaJurusan;
    }
    
}
