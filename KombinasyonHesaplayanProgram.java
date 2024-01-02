package Donguler;

/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı 
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class KombinasyonHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n , r , a = 1 , b = 1 , c = 1;
        System.out.print("Kümenin Eleman Sayısını Giriniz : ");
        n = input.nextInt();
        
        System.out.print("Kümeler Kaç Elemanlı Olacak Giriniz : ");
        r = input.nextInt();
        
        for(int i = 1; i<=n; i++){
            a*=i; //n!
        }
        
        for(int j = 1; j<=r; j++){
            b*=j; //r!
        }
            
        for(int k = 1; k<=(n-r); k++){
            c*=k; //(n-r)!
        }
        
        double kombinasyon = a/(b*c);
        System.err.println("C("+n+","+r+") = "+kombinasyon);
       
        
    }
    
}
