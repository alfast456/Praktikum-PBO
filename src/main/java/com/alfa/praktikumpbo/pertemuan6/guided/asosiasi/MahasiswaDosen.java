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
public class MahasiswaDosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matkul mk1 = new Matkul("TT306", "Pemrograman Robotik");
        Matkul mk2 = new Matkul("TT304", "Pemrograman Alam");
        
        Mahasiswa mhs1 = new Mahasiswa("19102915");
        
        mhs1.setKodeMatkul(mk1.getKdMatkul());
        mhs1.setKodeMatkul(mk2.getKdMatkul());
        mhs1.daftarMatkul();
    }
    
}
