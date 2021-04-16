/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan1.unguided;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan  : ");
        int bil = input.nextInt();
        
        if(bil%2==0)
            System.out.println(bil + " Adalah Bilangan Genap");
        else
            System.out.println(bil + " Adalah Bilangan Ganjil");
    }
    
}
