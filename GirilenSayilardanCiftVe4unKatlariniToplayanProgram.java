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
public class GirilenSayilardanCiftVe4unKatlariniToplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int total = 0;
        
        //Kullanıcı tek sayı girene kadar girilen sayıları kabul edecek , girilen değerler çift ve 4'ün katıysa toplyacak
        do{
            System.out.print("Bir Sayı Giriniz : ");
            sayi = input.nextInt();
            if((sayi % 2 == 0) && (sayi % 4 == 0)){
                total += sayi;
            }
            
        }while(sayi % 2 != 1);
        //Toplama işleminin sonucunu ekrana bastırdım.
        System.out.println("Toplam = " +total);
    }
    
}
