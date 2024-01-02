package Donguler;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class GirilenSayiyaKadaCiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan bir sayı girmesini istedim
        System.err.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        
        //Kullanıcının girdiği sayıya kadar olan çift sayıları ekrana bastırdım.
        for(int i = 0; i<=number; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
        
       
    
    }
    
}
