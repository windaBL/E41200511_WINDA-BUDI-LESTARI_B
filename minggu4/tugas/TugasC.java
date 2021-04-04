/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_statemen;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TugasC {
public static void main(String[] args) {
        // TODO code application logic here
        Scanner angka = new Scanner(System.in);
        
        int maks, Data, min, i, array[];
        int nilairata = 0;

        System.out.print("Masukkan Banyaknya Nilai: ");
        Data = angka.nextInt();
        array = new int[Data];

        for (i = 0; i < Data; i++) {
            System.out.print("Masukkan Data Nilai ke-" + (i + 1) + ": ");
            array[i] = angka.nextInt();
        }
        // mencari nilai minimum dan maksimum
        maks = array[0];
        min = array[0];

        for (i = 0; i < Data; i++) {
            if (array[i] > maks) {
                maks = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        //mencari rata-rata 
        for (i = 0; i < Data; i++) {
            nilairata += array[i];
        }
        nilairata = nilairata / i;

        System.out.println("--------------------------------");
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + maks);
        System.out.println("Nilai Rata-Ratanya adalah = " + " " + nilairata);
    }
    
}
