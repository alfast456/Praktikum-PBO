/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan2.guided;

/**
 *
 * @author HP
 */
public class Passed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nomor1, nomor2;
        
        TestPass pass = new TestPass(50, 100);
        nomor1 = 10;
        nomor2 = 20;
        
        //passed by value
        System.out.println("Nilai sebelum passed by value   :");
        System.out.println("Nomor1  : "+nomor1);
        System.out.println("Nomor2  : "+nomor2);
        
        pass.calculate(nomor1, nomor2);
        System.out.println("Nilai setelah passed   :");
        System.out.println("Nomor1  : "+nomor1);
        System.out.println("Nomor2  : "+nomor2);
        System.out.println("");
        
        System.out.println("Nilai passed by reference   : ");
        System.out.println("passed.nomor1   : "+pass.nomor1);
        System.out.println("passed.nomor2   : "+pass.nomor2);
        
        pass.calculate(pass);
        System.out.println("Nilai passed by reference   : ");
        System.out.println("passed.nomor1   : "+pass.nomor1);
        System.out.println("passed.nomor2   : "+pass.nomor2);
    }
    
}
