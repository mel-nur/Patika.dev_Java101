/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kosulluİfadeler;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SicakligaGoreEtkinlikOnerme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik ;
        
        //Kullanıcıdan hava sıcaklık değerini girmesini istedim.
        System.out.print("Hava Sıcaklığını Giriniz :");
        sicaklik = input.nextDouble();

        //Girilen sıcaklık değeri 5'ten küçükse ekrana 'Kayak Yapabilirsiniz' yazısı bastırılacak
        if(sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        //Girilen sıcaklık değeri 5-15 arasındaysa ekrana 'Sinemaya Gidebilirsiniz' yazısı bastırılacak
        else if (sicaklik>=5 && sicaklik<15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        //Girilen sıcaklık değeri 15-25 arasındaysa ekrana 'Piknik Yapabilirsiniz' yazısı bastırılacak
        else if (sicaklik>=15 && sicaklik<25) {
            System.out.println("Piknik Yapabilirsiniz");
        }
        //Girilen sıcaklık değeri 25'ten büyükse ekrana 'Yüzmeye Gidebilirsiniz' yazısı bastırılacak
        else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
