package Donguler;


import java.util.Scanner;

/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/

/**
 *
 * @author LENOVO
 */
public class MukemmelSayiBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi , result = 0;
        
        //Kullanıcıdan bir sayı girilmesi isteniyor
        System.out.print("Bir Sayı Giriniz : ");
        sayi = input.nextInt();
        
        //Girilen sayıya kadar bölen sayılar toplanıyor
        for(int i = 1; i<sayi; i++){
            if(sayi%i==0){
                result += i;
            }
        }
        //Girilen sayıya kadar olan bölen sayıların toplamı , girilen sayıya eşitse girilen sayı mükemmel sayıdır
        if(sayi == result){
            System.err.println(sayi+" Mükemmel Sayıdır");
        }
        //Girilen sayıya kadar olan bölen sayıların toplamı , girilen sayıya eşit değilse girilen sayı mükemmel sayı değildir
        else{
            System.err.println(sayi+" Mükemmel Sayı Değildir");
        }
    }
    
}
