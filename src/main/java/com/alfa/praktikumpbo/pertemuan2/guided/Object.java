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
public class Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.SetNama("Alfa");
        mahasiswaTanpa.setNim(19102195);
        
        //output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama    : "+mahasiswaTanpa.getNama());
        System.out.println("NIM     : "+mahasiswaTanpa.getNim());
        System.out.println("");
        
        //dengan parameter
        Mahasiswa mhs = new Mahasiswa("Harfa",19102195);
        //output
        System.out.println("Mahasiswa 2");
        System.out.println("Nama    : "+mhs.getNama());
        System.out.println("NIM     : "+mhs.getNim());
    }
    
}
