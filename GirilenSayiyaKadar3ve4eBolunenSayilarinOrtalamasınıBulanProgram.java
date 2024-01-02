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
public class GirilenSayiyaKadar3ve4eBolunenSayilarinOrtalamasınıBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan bir sayı girmesini istedim
        System.err.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int sayac = 0;
        int toplam = 0;
        
        //Kullanıcının girdiği sayıya kadar 3'e ve 4'e tam bölünen sayıları ekrana bastırıp topladım
        for(int i = 0; i<=number; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
               System.out.println(i);
               sayac++;
               toplam +=i;
            }
        }
        
        //Kaç adet sayı topladıysam toplama işleminin sonucuna böldüm ve ortalamatı buldum.
        double ortalama = toplam / sayac;
        
        //Bulduğum ortalama işleminin sonucunu ekrana bastırdım
        System.out.println("Ortalama : " +ortalama);
    }
    
}
