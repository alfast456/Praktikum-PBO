/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfa.praktikumpbo.pertemuan2.unguided;

/**
 *
 * @author HP
 */
public class Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        classNomor2 arrayClass[] = new classNomor2[3];
        
        classNomor2 class1 = new classNomor2();
        
        
        classNomor2 class2 = new classNomor2("Paimon");
        classNomor2 class3 = new classNomor2("Tatang", "Hydro");
        
        arrayClass[0] = class1;
        arrayClass[1] = class2;
        arrayClass[2] = class3;
        
        System.out.print("Daftar Nama Chara Cringe");
        for(classNomor2 x : arrayClass){
            System.out.println(" ");
            System.out.println("Nama Chara\t: "+ x.getNama());
            System.out.println("Vision\t\t: "+ x.getVision());
        }
    }
    
}
