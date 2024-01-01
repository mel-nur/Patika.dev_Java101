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
public class SayilariBuyuktenKucugeSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b , c ;
        //Kullanıcıdan a , b , c adında üç farklı sayı girmesini istedim
        System.out.print("a sayısını giriniz : ");
        a = input.nextInt();
        System.out.print("b sayısını giriniz : ");
        b = input.nextInt();
        System.out.print("c sayısını giriniz : ");
        c = input.nextInt();

        //Sayılar birbiri arasında kıyaslanıp büyükten küçüğe doğru sıralı bir şekilde ekrana bastırılacak
        if (a>b && a>c){
            if (b>c){
                System.out.println("a>b>c");
            }
            else if (c>b){
                System.out.println("a>c>b");
            }

        }
        else if (b>a && b>c){
            if (a>c){
                System.out.println("b>a>c");
            }
            else if (c>a){
                System.out.println("b>c>a");
            }

        }
        else if (c>a && c>b){
            if (a>b){
                System.out.println("c>a>b");
            }
            else if (b>a){
                System.out.println("c>b>a");
            }

        }
        //Girilen sayılar arasında eşitlik varsa bu kod bloğu çalışacak
        else{
            System.out.println("Sayılarda eşitlik var. Lütfen tekraar deneyiniz");
        }

    }
}

