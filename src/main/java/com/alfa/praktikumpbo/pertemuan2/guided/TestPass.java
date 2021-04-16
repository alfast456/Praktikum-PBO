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
public class TestPass {
    int nomor1, nomor2;
    
    public TestPass(int nomor1, int nomor2){
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }
    
    //pass by values
    void calculate(int m, int n){
        m = m * 10;
        n = n/2;
    }
    
    void calculate(TestPass pass){
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 /2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
