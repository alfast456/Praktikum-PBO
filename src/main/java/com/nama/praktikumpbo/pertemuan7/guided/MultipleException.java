/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nama.praktikumpbo.pertemuan7.guided;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MultipleException {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Maukkan Bilangan: ");
            int bil1 = input.nextInt();
            
            System.out.println("Masukkan pembagi: ");
            int bil2 = input.nextInt();
            
            int hasil = bil1/bil2;
            System.out.println(bil1+" : "+ bil2 + " = "+ hasil + " (dibulatkan)");
        }
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("Error: Tidak dapaat melakukan kalkulasi!");
        }
    }
}
