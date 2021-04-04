/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_statemen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TugasA {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    System.out.print("Masukkan jumlah deret : ");
    int angka = input.nextInt();
    int[]array = new int [angka];
    System.out.println("Masukkan semua deret");
    for(int i = 0; i <angka; i++) {
        array[i] = input.nextInt();
        
    }
    Arrays.sort(array);
    for (int index:array){
        System.out.println("setelah diurutkan " +index);
    }
            
    }
}
