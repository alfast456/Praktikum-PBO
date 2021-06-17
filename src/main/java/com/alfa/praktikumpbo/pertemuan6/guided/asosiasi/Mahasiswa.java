/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan6.guided.asosiasi;

/**
 *
 * @author HP
 */
class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    private String NIM;
    protected String[] kodeMatkul =new String[2];
    protected String[] namaMatkul =new String[2];
    private int jmlMatkul =0;
    
    public Mahasiswa(String kode){
        this.NIM=kode;
    }
    public void setNIM(String NIM){
        this.NIM=NIM;
    }
    public void setKodeMatkul(String KdMakul){
        kodeMatkul[jmlMatkul]=KdMakul;
        jmlMatkul++;
    }
    public void setNamaMatkul(String NmMakul){
        kodeMatkul[jmlMatkul]=NmMakul;
        jmlMatkul++;
    }
    public String getNIM() {
        return this.NIM;
    }
    public int getJmlMatkul() {
        return this.jmlMatkul;
    }
    
    public void daftarMatkul(){
        System.out.println("NIM : "+NIM);
        System.out.println("Daftar Makul yang Diambil : ");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println(kodeMatkul[i]);
        }
    }
}
