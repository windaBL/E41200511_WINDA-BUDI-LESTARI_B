/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_statemen;

/**
 *
 * @author acer
 */
public class TugasB {
    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 2 (0-100)");
        System.out.println("===========================");
        int hitung = 1;
        
        do { 
            System.out.print(" " +hitung);
            hitung = (hitung*2);
        } while ( hitung <= 100);
    }
}
