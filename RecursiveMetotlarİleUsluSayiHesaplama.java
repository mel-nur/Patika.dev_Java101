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
public class RecursiveMetotlarİleUsluSayiHesaplama {

    static int us(int taban, int us){
        if(us != 0){
           return taban*us(taban , us-1);
        }
        else{
            return 1;
        } 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban , us;
        
        System.out.print("Lütfen Taban Olacak Sayıyı Giriniz : ");
        taban = input.nextInt();
        System.out.print("Lütfen Üs Olacak Sayıyı Giriniz : ");
        us = input.nextInt();
        int result = us(taban, us);
        System.err.println(taban+"^"+us+" İŞleminin Sonucu = "+result);

    }
    
}
