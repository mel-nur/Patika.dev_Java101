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
public class SayilariKucuktenBuyugeSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A , B , C ;
        
        //Kullanıcıdan A , B , C adında üç farklı sayı girmesini istedim
        System.out.print("A sayısını giriniz : ");
        A = input.nextInt();
        System.out.print("B sayısını giriniz : ");
        B = input.nextInt();
        System.out.print("C sayısını giriniz : ");
        C = input.nextInt();

        //Girilen sayılar birbiri arasında kıyaslanıp ekrana küçükten büyüğe sıralı bir şekilde bastırılacak
        if (A<B && A<C){
            if (B<C){
                System.out.println("A<B<C");
            }
            else if (C<B){
                System.out.println("A<C<B");
            }

        }
        else if (B<C && B<A){
            if (C<A){
                System.out.println("B<C<A");
            }
            else if (A<C){
                System.out.println("B<A<C");
            }

        }
        else if (C<A && C<B){
            if (A<B){
                System.out.println("C<A<B");
            }
            else if (B<A){
                System.out.println("C<B<A");
            }

        }
        //Girilen sayılar arasında eşitlik varsa bu kod bloğu çalışacak
        else{
            System.out.println("Sayılarda eşitlik var. Lütfen tekraar deneyiniz");
        }
    }
}
