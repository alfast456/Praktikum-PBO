/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.unguided;

/**
 *
 * @author HP
 */
public class Order {
    
    private String pembeli;
    private Paket[] keranjang = new Paket[99];
    private int pesanan = 0;
    
    public Order(String pembeli){
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }
    
    public void masukKeranjang(Paket paket) {
        keranjang[pesanan] = paket;
        pesanan++;
        System.out.println("Paket hosting " + paket.getHosting() 
                + " berhasil dimasukkan ke keranjang oleh "
                + this.getPembeli());
    }
    
    public void totalPesanan(){
        if(pesanan > 0){
            System.out.println("Keranjang pesanan "
            + this.getPembeli()+ ": ");
            System.out.println("__________________________________");
            System.out.println("- Jenis  |   Harga   | Keterangan-");
            for (int i = 0; i < pesanan; i++) {
                Paket pesanan = keranjang[i];
                System.out.println("- " + pesanan.getHosting()
                                        + "  Rp." + pesanan.getHarga()
                                        + " (" +pesanan.getKeterangan()
                                        + ")-"); 
            }
            System.out.println("");
        }else {
            System.out.println("Anda belum pernah memesan apa aja!");
            System.out.println("");
        }
    }
    
    public void bayarPesanan(){
        if(pesanan > 0){
            System.out.println("Total Pesanan Anda Adalah :");
            for (int i=0; i < pesanan; i++) {
                Paket total = keranjang[i];
                System.out.print(total.getHarga()+"+");
            }System.out.println("");
        }
    }
    
    public void kosongkanKeranjang(){
        System.out.println("Terimakasih Telah Melihat Katalog kami");
        this.keranjang = new Paket[99];
        this.pesanan = 0;
        System.out.println("Pesanan berhasil direset");
        System.out.println("");
    }
}
