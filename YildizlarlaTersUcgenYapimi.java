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
public class YildizlarlaTersUcgenYapimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();
        
        for(int i = 1; i<=number; i++){
            for(int j = 0; j<=(i-1); j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=(2*number)-(2*i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
