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
public class D {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String nama;
        int harga1, harga2, harga3, harga4, harga5;
        double hasil;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("                        Kharisma Agung Plaza (KAP)                  ");
        System.out.println("                         Promo Belanja Berhadiah                    ");
        System.out.println("                   Khusus Pembelian 5 Barang Pertama                ");
        System.out.println("                   Dengan Harga Minimun Rp 100.000,00               ");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = abc.nextLine();
        System.out.println("");
        System.out.print("Masukkan harga barang ke-1 : ");
        harga1 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        harga2 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        harga3 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        harga4 = abc.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        harga5 = abc.nextInt();
        
        hasil = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total harga pembelian atas nama "+ nama + "adalah Rp "+hasil);
        System.out.println("");
        if (hasil > 100000) {
            System.out.println("Selamat.....");
            System.out.println("Anda mendapatkan 1 buah mug cantik");
        } else {
            System.out.println("Terimakasih atas kunjungannya, silahkan datang kembali lain waktu");
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("                            Terima kasih                            ");
        System.out.println("             Anda sudah belanja di kharisma agung plaza             ");
    }
}
