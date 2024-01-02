package Donguler;


import java.util.Scanner;

/*
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir
sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında
altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın
orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
 */

/**
 *
 * @author LENOVO
 */
public class FibonacciSerisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int eleman , f1=0 , f2= 1 ;
        //Kullanıcıdan kaç elemanlı fibonacci serisi istiyorsa onu girmesini istiyorum
        System.out.print("Kaç Elemanlı Fibonacci Serisi İstiyorsunuz : ");
        eleman = input.nextInt();
        
        //Fibonacci serisinin ilk iki elemanını ekrana bastırdım
        System.out.print(f1+" "+f2+" ");
        //Her sayı kendisinden bir önceki sayıyla toplanıp ekrana bastırılıyor
        for(int i = 2; i<=eleman; i++){
            int fib = f1+f2;
            System.out.print(fib+ " ");
            //Değişkenler birbirlerine atanıyor
            f1 = f2;
            f2=fib;
        }
    }
    
}
