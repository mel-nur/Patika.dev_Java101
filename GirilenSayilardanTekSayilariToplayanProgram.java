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
public class GirilenSayilardanTekSayilariToplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int sayi;
       int total = 0;
       
       //Kullanıcı negatif bir değer girene kadar girilen değerleri kabul edecek ve girilen değerlerden tek sayıları toplayacak
       do{
           System.out.print("Bir Sayı Giriniz : ");
           sayi = input.nextInt();
           if(sayi % 2 == 1){
              total += sayi;
           }
               
       }while(sayi >= 0);
       
       //Girilen tek sayıların toplamını ekrana bastırdım.
        System.err.println("Toplam : " +total);
    }
}
