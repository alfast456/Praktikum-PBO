/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.unguided;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Menu {
    private static void tampilkanMenu() {
        // TODO code application logic here
        int nomorPaket = 1;
        System.out.println("______________________________");
        System.out.println("No|Jenis |  Harga | Keterangan");
        for (Paket paket : menu) {
            System.out.println(nomorPaket+ ". " +paket.showDetail());
            nomorPaket++;
        }System.out.println("");
    }
    private static Paket[] menu = {
        new Paket("Mythic", 600_000, "4GB RAM"),
        new Paket("Legend", 500_000, "3,5GB RAM"),
        new Paket("Epic  ", 400_000, "3GB RAM"),
        new Paket("Master", 300_000, "2,5GB RAM"),
        new Paket("Bronze", 200_000, "2GB RAM")
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean keepLooping = true;
        
        System.out.println("Sebelum Melihat katalog kami silahkan "
                + "mengisi nama anda");
        System.out.print("Masukkan nama: ");
        String namaPembeli = input.nextLine();
        Order order = new Order(namaPembeli);
        
        System.out.println("");
        do{
            System.out.println("== Menu Utama ==");
            System.out.println("1) Lihat Katalog");
            System.out.println("2) Cek Keranjang");
            System.out.println("3) Bayar Pesanan");
            System.out.println("4) keluar");
            System.out.print("> ");
            
            int nav = input.nextInt();
            System.out.println("");
            
            switch(nav){
                case 1:
                    tampilkanMenu();
                    System.out.print("pilih paket hosting yang ingin dipesan: ");
                    int indexItem = input.nextInt() -1;
                    
                    //jika user menginput yang aneh2
                    if (indexItem < 0 || indexItem >= menu.length ) {
                        System.out.print("Error: inputkan menu yang benar");
                    }else{
                        order.masukKeranjang(menu[indexItem]);
                    System.out.println("");
                    break;
                    }
                    
                case 2://melihat
                    order.totalPesanan();
                    break;
                    
                case 3://kosongkan 
                    order.bayarPesanan();
                    System.out.print("Bayar : ");
                    int total = input.nextInt();
                    System.out.println("");
                    order.kosongkanKeranjang();
                    keepLooping = false;
                    
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
