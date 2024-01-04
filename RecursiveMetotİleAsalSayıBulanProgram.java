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
public class RecursiveMetotİleAsalSayıBulanProgram {

    static int asal(int sayi , int b){
        if(b<sayi){
            if(sayi%b != 0){
                return asal(sayi, b++);
            }
            else{
                return 0; 
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();
        
        if(asal(sayi, 2)==1){
            System.err.println(sayi+" Asal Sayıdır...");
        }
        else{
            System.err.println(sayi+" Sayısı Asal Sayı Değildir...");
        }
    }
    
}
