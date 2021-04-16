package com.alfa.praktikumpbo.pertemuan1.guided;
import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==> Edit Profile <==");
        System.out.println("");
        
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Inisial : ");
        char initial = input.nextLine().charAt(0);
        
        System.out.print("Masukkan usia : ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        float tinggi = input.nextFloat();
        
        System.out.println("");
        System.out.println("==> Profile Saya <==");
        System.out.println("");
        System.out.println("Nama    : "+nama);
        System.out.println("Inisial : "+initial);
        System.out.println("Usia    : "+usia+" tahun");
        System.out.println("Tinggi  : "+tinggi+" cm");
    }
    
}
