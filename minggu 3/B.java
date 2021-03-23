/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class B {
    public static void main(String[] args) {
        // membuat objek input 
        Scanner input = new Scanner (System.in);
        int jumlahderet = 0;
        
        System.out.print("Masukkan jumlah deret (deret hanya berisikan sampai angka 5): ");
        //nextin digunakkan untuk membaca baris angka yang diinputkan user
        jumlahderet =input.nextInt();
        
        int [] deretarray = new int [jumlahderet];
        
        for (int i = 0; i < jumlahderet; i++) {
            //math.random()*5 digunakan untuk menampilkan angka secara random dengan batasan sampai angka 5
            deretarray[i]=(int) (Math.random()* 5);
            
        }
        for (int j = 0; j < jumlahderet; j++) {
            System.out.print(deretarray[j]+" ");
        }
    }
}
