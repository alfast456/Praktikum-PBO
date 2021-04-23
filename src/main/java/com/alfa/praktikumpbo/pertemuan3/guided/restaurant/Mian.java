/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.guided.restaurant;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Mian {
    private static void tampilkanMenu() {
        // TODO code application logic here
        int nomorItem = 1;
        for (Item item : menu) {
            System.out.println(nomorItem+ ". " +item.showDetail());
            nomorItem++;
        }System.out.println("");
    }
    private static Item[] menu = {
        new Item("Mendoan", 1_000, "makanan"),
        new Item("Es teh", 2_500, "minuman"),
        new Item("aneka sayuran", 5_000, "makanan"),
        new Item("Paha Ayam", 7_500, "makanan"),
        new Item("sate ayam", 15_000, "makanan")
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepLooping = true;
        
        System.out.print("Masukkan nama: ");
        String namaPembeli = input.nextLine();
        Pembeli pembeli = new Pembeli(namaPembeli);
        
        System.out.println("");
        do{
            System.out.println("==> Menu Utama <==");
            System.out.println("1) Pesan makanan");
            System.out.println("2) Lihat history pemesanan");
            System.out.println("3) Kosongkan history pemesanan");
            System.out.println("4) keluar");
            System.out.print("> ");
            
            int nav = input.nextInt();
            System.out.println("");
            
            switch(nav){
                case 1:
                    tampilkanMenu();
                    System.out.print("pilih makanan yang ingin dipesan: ");
                    int indexItem = input.nextInt() -1;
                    
                    //jika user menginput yang aneh2
                    if (indexItem < 0 || indexItem >= menu.length ) {
                        System.out.print("Error: inputkan menu yang benar");
                    }else{
                        pembeli.lakukanPemesanan(menu[indexItem]);
                    System.out.println("");
                    break;
                    }
                    
                case 2://melihat
                    pembeli.lihatHistoryPemesanan();
                    break;
                    
                case 3://kosongkan 
                    pembeli.kosongkanHistory();
                    break;
                    
                case 4://keluar
                    System.out.println("Terimakasih sudah memesan!");
                    keepLooping = false;
                    
                default://
                    System.out.println("Inputkan hanya 1-4 saja!");
                    System.out.println("");
                    break;
            }
        }while(keepLooping);
    }
}
