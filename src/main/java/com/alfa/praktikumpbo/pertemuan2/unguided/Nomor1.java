/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan2.unguided;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Nomor1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lahiran();
    }
    
    public static void Lahiran() {
        // inisialisasi input
        Scanner masuk = new Scanner(System.in);
        
        // inisialisasi ke variabel
        Calendar tahun = Calendar.getInstance();
        
        // tampung ke variabel
        int yearNow = tahun.get(Calendar.YEAR);
        
        System.out.print("Masukkan Tahun Lahir: ");
        
        // rumus
        int tahunLahir = masuk.nextInt();
        int umur = yearNow - tahunLahir;
        
        System.out.println("Umur Kamu adalah "+ umur +" Tahun");
        
    }
}
