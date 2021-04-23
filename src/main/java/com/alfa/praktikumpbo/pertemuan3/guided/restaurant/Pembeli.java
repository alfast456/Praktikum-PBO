/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.guided.restaurant;

/**
 *
 * @author HP
 */
public class Pembeli {
    private String nama;
    private Item[] historyPemesanan = new Item[99];
    private int itemsOrdered = 0;
    
    public Pembeli(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void lakukanPemesanan(Item item){
        historyPemesanan[itemsOrdered] = item;
        itemsOrdered++;
        System.out.println(item.getNama()
                + " berhasil ditambahkan ke history pemesanan "
                + this.getNama());
    }
    
    public void lihatHistoryPemesanan() {
        if(itemsOrdered > 0){
            System.out.println("History pemesanan sdr"
            + this.getNama() + ": ");
            for (int i = 0; i <itemsOrdered; i++) {
                Item pesanan = historyPemesanan[i];
                System.out.println("- " + pesanan.getNama()
                                        + "( " + pesanan.getJenis()
                                        + ") - Rp" +pesanan.getHarga()); 
            }
            System.out.println("");
        }else {
            System.out.println("Anda belum pernah memesan apa aja!");
            System.out.println("");
        }
    }
    public void kosongkanHistory(){
        System.out.println("Mereset history...");
        this.historyPemesanan = new Item[99];
        this.itemsOrdered = 0;
        System.out.println("History berhasil direset");
        System.out.println("");
    }
    
}
