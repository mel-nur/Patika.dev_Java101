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
public class BasamakSayilarininToplaminiHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int tempSayi , result = 0 , deger;
        //Kullanıcıdan bir sayı girmesini istedim
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();
        
        //Kullanıcının girdiği sayıyı kaybetmemek için bir değere atadım.
        tempSayi=sayi;
        
        //Girilen sayı sıfıra eşit olmadığı sürece 10'a bölümünden kalan değerler toplanır.(Basamak değerleri toplanır)
        while(tempSayi != 0){
            deger = 0;
            deger = tempSayi % 10;
            result += deger;
            tempSayi /= 10;
        }
        //Bulunan basamak değerlerinin toplamı sonucu ekrana bastırılır.
        System.out.println("Basamak Sayılarının Toplamı Sonucu = " +result);
        
    }
    
}
