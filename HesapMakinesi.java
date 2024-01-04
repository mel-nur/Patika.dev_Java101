/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metot;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HesapMakinesi {
    //Kullanıcı tarafından girilen iki sayının toplam sonucunu döndüren metot
    static int topla(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        int birinciSayi = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int ikinciSayi = input.nextInt();
        int result = birinciSayi+ikinciSayi;
        return result;
    }
    //Kullanıcı tarafından girilen iki sayıyı birbirinden çıkartma sonucunu döndüren metot
    static int cıkarma(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        int birinciSayi = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int ikinciSayi = input.nextInt();
        int result = birinciSayi-ikinciSayi;
        return result;
    }
    //Kullanıcı tarafından girilen iki sayınının çarpım sonucunu döndüren metot
    static int carpma(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        int birinciSayi = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int ikinciSayi = input.nextInt();
        int result = birinciSayi*ikinciSayi;
        return result;
    }
    //Kullanıcı tarafından girilen iki sayınının bölüm sonucunu döndüren metot
    static void bolme(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        double birinciSayi = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        double ikinciSayi = input.nextInt();
        //Kullanıcı tarafından girilen 2. sayı 0'sa bu kod bloğu çalışacak
        if(ikinciSayi==0){
            System.err.println("Payda 0 olamaz ... ");
        }
        else{
           double result = birinciSayi/ikinciSayi;
           System.err.println("Bölme İşleminin Sonucu : " +result); 
        }
    }
    //Kullanıcı tarafından girilen sayılarla üs hesaplama işlemi yapan metot
    static int usHesaplama(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayı: ");
        int taban = input.nextInt();
        System.out.print("Üs Sayı : ");
        int us = input.nextInt();
        int result = 1;
        for(int i = 1; i<=us; i++){
            result *= taban;
        }
        return result;
    }
    //Kullanıcı tarafından girilen sayının faktöriyelini hesaplayan metot
    static int faktoriyel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = input.nextInt();
        int result = 1;
        for(int i = 1; i<=sayi; i++){
            result *= i;
        }
        return result;
    }
    //Kullanıcı tarafından girilen sayının , kullanıcı tarafından girilen sayıya göre modunu alan metot
    static int modAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int birinciSayi = input.nextInt();
        System.out.print("Lütfen Mod Sayısını Giriniz : ");
        int ikinciSayi = input.nextInt();
        int result = birinciSayi%ikinciSayi;
        return result;
    }
    //Kullanıcı tarafından girilen dikdörtgen kenarlarının uzunluklarıyla , dikdörtgenin alanını ve çevresini hesaplayan metot
    static void dikdortgen(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dikdörtgenin Kısa Kenarını Giriniz : ");
        int kisa = input.nextInt();
        System.out.print("Lütfen Dikdörtgenin Uzun Kenarını Giriniz : ");
        int uzun = input.nextInt();
        int alan = kisa*uzun;
        int cevre = 2*(uzun+kisa);
        System.err.println("Dikdörtgenin Alanı : " +alan);
        System.err.println("Dikdörtgenin Çevresi : "+cevre);
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int select;
        //Kullanıcı tarafından seçilen işlemi yapan metot çağrılıp sonuçlar ekrana bastırılacaktır.
        while(true){
            System.out.println("1-Toplama İşlemi\n"
                    +"2-Çıkarma İşlemi\n"
                    +"3-Çaprma İşlemi\n"
                    +"4-Bölme İşlemi\n"
                    +"5-Üslü Sayı Hesaplama İşlemi\n"
                    +"6-Faktoriyel Hesaplama İşlemi\n"
                    +"7-Mod Alma İşlemi\n"
                    +"8-Dikdörtgen Alanı ve Çevre Hesaplama İşlemi\n"
                    +"9-Çıkış Yap");
            
            System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
            select = input.nextInt();
            //Kullanıcı eğer 9 seçeneğini seçerse çıkış yapılacaktır.
            if(select == 9){
                break;
            }
            switch (select) {
                case 1:
                    System.err.println("Toplama İşleminin Sonucu : "+topla());
                    break;
                case 2:
                    System.err.println("Çıkarma İşleminin Sonucu : "+cıkarma());
                    break;
                case 3:
                    System.err.println("Çarpma İşleminin Sonucu : "+carpma());
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    System.err.println("Üslü Sayı Hesaplama İşlemi Sonucu : " +usHesaplama());
                    break;
                case 6:
                    System.err.println("Faktöriyel Hesaplama İşlemi Sonucu : "+faktoriyel());
                    break;
                case 7:
                    System.err.println("Mod Alma İşlemi Sonucu : "+modAlma());
                    break;
                case 8:
                    dikdortgen();
                    break;
                 //Kullanıcı 1-9 arası sayı seçmezse bu kod bloğu çalışacak 
                default:
                    System.err.println("Geçersiz Bir İşlem Seçtiniz");
                 
            }
          
        }
        System.err.println("Çıkış Yaptınız...");
    }
    
}
