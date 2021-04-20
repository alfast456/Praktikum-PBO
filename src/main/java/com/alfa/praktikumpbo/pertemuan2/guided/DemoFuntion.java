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
public class DemoFuntion {
    public static void main(String[] args) {
        drawTriangle(3);
        drawSquare(5,7);
        drawSquare(2,2);
    }
    /**
     * @param length
     */
    public static void drawTriangle(int length) {
        // TODO code application logic here
        for (int row=1; row<=length; row++){
            for(int column=1; column<=row; column++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    static void drawSquare(int length, int width) {
        for(int row=1; row<=length; row++){
            for(int column=1; column<=width; column++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
    
}