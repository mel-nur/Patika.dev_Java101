package Donguler;


import java.util.Scanner;

/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

/**
 *
 * @author LENOVO
 */
public class GirilenSayiyaKadar4ve5inKuvvetleriniBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi , sayac1 = 0 , sayac2 = 0;
        
        //Kullanıcıdan bir sayı girmesini istedim.
        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();
        
        //Kullanıcının girdiği sayıya kadar 4'ün kuvvetleri ekrana bastırılacak
        for(int i = 1; i<=sayi; i*=4){
            System.out.println("4^"+sayac1+" = "+i);
            sayac1++;
        }
        
         //Kullanıcının girdiği sayıya kadar 5'in kuvvetleri ekrana bastırılacak
        for(int j = 1; j<=sayi; j*=5){
            System.out.println("4^"+sayac2+" = "+j);
            sayac2++;
        }
    }
    
}
