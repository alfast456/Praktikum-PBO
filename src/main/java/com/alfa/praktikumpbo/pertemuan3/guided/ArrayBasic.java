/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan3.guided;

/**
 *
 * @author HP
 */
public class ArrayBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // type data[] nama array = new type data[panjang array
       int[] numbers = new int[10];
       
       //Array diisi dengan bilangan 0-9
       for(int i=0; i<10; i++){
           numbers[i] = i;
       }
       //output
        System.out.println("Isi Array dengan Numbers: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+"");
        }
        System.out.println("");
        
        System.out.println("Isi Array number: ");
        for(int number : numbers){
            System.out.print(number+"");
        }
        System.out.println("");
    }
    
}
