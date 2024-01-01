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
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n1 , n2 , select;
        
        //Kullanıcıdan 1. sayıyı girmesini istedim
        System.out.print("Enter the 1st number : ");
        n1 = input.nextInt();
        
        //kulllanıcıdan 2. sayıyı girmesini istedim
        System.out.print("Enter the 2nd number : ");
        n2 = input.nextInt();
        
        //Kullanıcıdan toplama , çıkarma , çarpma , bölme işlemlerinden birisini seçmesini istedim
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your Choice : ");
        select = input.nextInt();

        //Kullanıcı 1. işlemi seçerse toplama işlemi yapılacak ve sonuç ekrana yazdırılacak
        if(select == 1){
            System.out.println("Addition Result =  " + (n1+n2));
        }
        //Kullanıcı 2. işlemi seçerse çıkarma işlemi yapılacak ve sonuç ekrana yazdırılacak
        else if(select == 2){
            System.out.println("Subtraction Result = " + (n1-n2));
        }
        //Kullanıcı 3. işlemi seçerse çarpma işlemi yapılacak ve sonuç ekrana yazdırılacak
        else if (select == 3) {
            System.out.println("Multiplication Result = " + (n1*n2));
        }
        //Kullanıcı 4. işlemi seçerse bölme işlemi yapılacak ve sonuç ekrana yazdırılacak
        else if (select == 4) {
            if(n2 != 0){
                System.out.println("Division Result = "+(n1/n2));
            }
            //Payda kısmı eğer 0 girilirse 'sayı sıfıra bölünemez' yazısı ekrana bastırılacak
            else{
                System.out.println("cannot be divided by 0");
            }
        //Geçersiz bir işlem girilmesi sonucunda 'Geçersiz Bir Seçenek Girdiniz' yazısı ekrana bastırılacak
        }
        else{
            System.out.println("You Entered an Invalid Option");
        }

    }
}

