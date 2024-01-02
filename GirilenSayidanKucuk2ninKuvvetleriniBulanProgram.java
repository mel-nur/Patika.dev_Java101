package Donguler;


import java.util.Scanner;

/*
Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
/**
 *
 * @author LENOVO
 */
public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n , j = 0;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan bir değer girmesini istedim
        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();
        //Kullanıcın girdiği değere kadar 2'nin kuvvetleri ekrana bastırılacak
        for ( int i = 1; i<n; i*=2){
            System.out.println("2^"+j+" = "+i);
            j++;
           
        }
    }
    
}
