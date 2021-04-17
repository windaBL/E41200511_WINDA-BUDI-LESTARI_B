/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class descending {

    public static void main(String[] args)
    {
        int []arr= new int[]{39, 18, 02, 10, 35, 27};
        int temp = 0;
        System.out.println("PROGRAM PENGURUTAN SECARA DESCENDING");
        System.out.println("====================================");
        System.out.println("Data Sebelum Diurutkan :");
        for (int i=0; i < arr.length; i++){
            System.out.print (arr[i] + " ");
            
        }System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("setelah data diurutkan");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
}
    
}
