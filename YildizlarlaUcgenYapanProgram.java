package Donguler;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class YildizlarlaUcgenYapanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();
        
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<(n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i+1)-2; k++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
    
}
