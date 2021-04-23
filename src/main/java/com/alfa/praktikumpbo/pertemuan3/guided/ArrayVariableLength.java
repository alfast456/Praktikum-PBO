/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.guided;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArrayVariableLength {
    //proses encapsulasi
    public static void isiArray(int[] array) {
        //looping untuk mengisi bilangan
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
    public static void lihatIsiArray(int[] array) {
        //output array
        System.out.println("Isi Array numbers: ");
        for (int number : array) {
            System.out.print(number+" ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //meminta user menginput panjang array
        System.out.print("Masukkan panjang array: ");
        int length = input.nextInt();
        
        //pembuatan panjang array sesuai input user
        int[] numbers = new int[length];
        
        isiArray(numbers);
        lihatIsiArray(numbers);
        
    }
    
}
