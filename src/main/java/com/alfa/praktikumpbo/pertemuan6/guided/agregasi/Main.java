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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen=new Dosen("109847", "Paijo");
        Jurusan jurusan=new Jurusan("Teknik  informatika");
        jurusan.setDosen(dosen);
        
        System.out.println("NIDN Dosen :"+jurusan.getDosen().getNIDN());
        System.out.println("Nama Dosen :"+jurusan.getDosen().getNama());
        System.out.println("Jurusan : "+jurusan.getNamaJurusan());
    }
    
}
