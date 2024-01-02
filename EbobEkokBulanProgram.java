package Donguler;


import java.util.Scanner;

/*
EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin 
en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne 
bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
 */

/**
 *
 * @author LENOVO
 */
public class EbobEkokBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi1 , sayi2 , a=1 , b=1, ebob=1 , ekok=1; 
        
        //Kullanıcıdan iki tane sayı girmesini istedim
        System.out.print("1. Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        
        //Girilen sayılardan sayı1 i bölen en büyük sayı bulunur
        while(a<=sayi1){
            if((sayi1 % a == 0) && (sayi2 % a == 0)){
                ebob = a;
            }
          a++;
        }
        //EBOB ekrana bastırılır
        System.out.println("EBOB : " +ebob);
        
        //Girilen sayıların en küçük ortak katı bulunur
        while(b<=(sayi2*sayi1)){
            if((b%sayi1 == 0) && (b%sayi2 == 0)){
                ekok = b;
                break;
            }
          b++;
        }
        //EKOK ekrana bastırılır
        System.out.println("EKOK : "+ekok);
    }
    
}
