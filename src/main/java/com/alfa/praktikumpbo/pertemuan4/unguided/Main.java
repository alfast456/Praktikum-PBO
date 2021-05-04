/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan4.unguided;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean keepLooping = true;
        do{
            System.out.println("");
            System.out.println("++++Aplikasi Chat Bot++++");
            System.out.println("Pilih menu dibawah ini untuk memulai chat");
            System.out.println("1. Cewek");
            System.out.println("2. Cowok");
            System.out.println("3. Rahasia");
            System.out.println("4. Keluar");
            System.out.print("Pilih=>");
            int nav = input.nextInt();

            switch(nav){
                case 1:
                    Cewek cewek = new Cewek("Suzy Ozawa");
                    System.out.print("Bot : ");
                    cewek.showChat();
                    System.out.println("");
                    break;

                case 2:
                    Parent cowok = new Cowok("Jordi");
                    System.out.print("Bot : ");
                    cowok.showChat();
                    System.out.println("");
                    break;
                    
                case 3:
                    Guy guy = new Guy("banci andang");
                    System.out.print("Bot : ");
                    guy.showChat();
                    System.out.println("");
                    break;

                case 4://keluar
                    System.out.println("Terimakasih sudah menggunakan aplikasi ini");
                    keepLooping = false;
                
                default:
                    System.out.println("Maap ngab salah nginputin menu");
                    break;
            }
        }while(keepLooping);
    }
}
