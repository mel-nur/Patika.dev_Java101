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
public class FaktoriyelHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi , sonuc = 1;
        
        //Kullanıcıdan faktöriyelini hesaplanmasını istediği sayıyı girmesini istiyorum
        System.out.print("Faktoriyeli Hesaplanacak Sayıyı Giriniz: ");
        sayi = input.nextInt();
        
        //1'den girilen sayıya kadar çarpma işlemi yapılıp faktöriyel bulunacak
        for(int i = 1; i<=sayi; i++ ){
            sonuc *= i;
        }
        
        //Bulunan faktöriyel işleminin sonucu ekrana bastırılacak
        System.out.println(sayi +"! = "+sonuc);
    }
    
}
