package com.alfa.praktikumpbo.pertemuan1.guided;
import java.util.Scanner;

public class DemoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan   : ");

        int bil = input.nextInt();
        
        if(bil > 0)
            System.out.println(bil + " Adalah Bilangan Positif");
        else if(bil < 0)
            System.out.println(bil + " Adalah Bilangan Negatif");
        else
            System.out.println(bil + " Adalah Bilangan Nol");
    }
    
}
