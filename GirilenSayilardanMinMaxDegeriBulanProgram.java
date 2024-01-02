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
public class GirilenSayilardanMinMaxDegeriBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n , sayi , max = 0 , min = 0; 
        //Kullanıcıdan kaç tane sayı gireceği bilgisi isteniyor
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = input.nextInt();
        
        //Kullanıcının girdiği sayı adedi kadar sayı girilmesi isteniyor
        for(int i = 1; i<=n; i++){
            System.out.print("Sayı Giriniz : ");
            sayi = input.nextInt();
            
            //Girilen sayı max sayıdan büyükse yeni girilen sayı max sayı olur
            if(sayi>max){
                if(min == 0){
                    min = sayi;
                }
                max = sayi;
            }
            //Girilen sayı min sayıdan küçükse yeni girilen sayı min syaısı olur
            if(sayi<min) {
                if(max == 0){
                    max = sayi;
                }
                min = sayi;
                
                
            }
        }
        //Girilen sayıların içinden max ve min sayıları ekrana bastırılır.
        System.out.println("En Büyük Sayı : "+max);
        System.out.println("En Küçük Sayı : " +min);
        
    }
    
}
