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
public class UsluSayiHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi , us , sonuc = 1;
        
        //Kullanıcıdan üssü alınacak sayıyı girmesini istedim
        System.out.print("Üssü Alınacak Sayı : ");
        sayi = input.nextInt();
        
        //Kullanıcıdan üs olacak sayıyı girmesini istedim.
        System.out.print("Üs Olacak Sayi : ");
        us = input.nextInt();
        //Kullanıcının girdiği üssü alınacak sayı , üs olacak sayı kadar çarpılıp üs alma işlemi yapılır.
        for(int i = 1; i<=us; i++){
            sonuc *= sayi;
        }
        //Üs alma işleminin sonucu ekrana bastırılır.
        System.out.println(sayi+"^"+us+" = "+sonuc);
        
    }
    
}
