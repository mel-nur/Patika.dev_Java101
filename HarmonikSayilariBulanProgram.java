package Donguler;


import java.util.Scanner;

/*

 */

/**
 *
 * @author LENOVO
 */
public class HarmonikSayilariBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double result = 0.0;
        
        //Kullanıcıdan bir sayı girmesini istedim
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = input.nextInt();
        //1'den girilen sayıya kadar (1/sayi) toplama işlemi yapılır
        for(double i = 1; i<=sayi; i++){
            result += (1/i);
        }
        
        //Bulunan sonuç ekrana bastırılır.
        System.out.println("Harmonik Sayısı " + result);
    }
    
}
