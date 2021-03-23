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
public class E {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String nama;
        int angka;
        
        System.out.println("---------------------------------------------------");
        System.out.println("                      CAFE CERIA                   ");
        System.out.println("                     ANEKA MINUMAN                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("                     SPECIAL MENU                  ");
        System.out.println("                   1. Soft Drink                   ");
        System.out.println("                   2. Mix Juice                    ");
        System.out.println("                   3. Nescafe                      ");
        System.out.println("                   4. Soda Milk                    ");
        System.out.println("                   5. Tea                          ");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = abc.nextLine();
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        angka = abc.nextInt();
        switch (angka) {
            case 1:
                System.out.println("minuman yang anda pesan adalah Soft Drink");
                System.out.println("pesanan akan segera kami antar");
                break;
            case 2:
                System.out.println("minuman yang anda pesan adalah Mix Juice");
                System.out.println("pesanan akan segera kami antar");
                break;    
            case 3:
                System.out.println("minuman yang anda pesan adalah Nescafe");
                System.out.println("pesanan akan segera kami antar");
                break;
            case 4:
                System.out.println("minuman yang anda pesan adalah Soda Milk");
                System.out.println("pesanan akan segera kami antar");
                break;
            case 5:
                System.out.println("minuman yang anda pesan adalah Soft Drink");
                System.out.println("pesanan akan segera kami antar");
                break;
            default :
                System.out.println("menu tidak tersedia");
                
        }
        System.out.println("Terima kasih "+nama +" telah berkunjung di Cafe Ceria");
    }
}
