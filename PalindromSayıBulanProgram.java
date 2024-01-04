/*
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
package Metot;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PalindromSayiBulanProgram {
    
    //Kullanıcı tarafından girilen sayının palindrom sayı olup olmadığını kontorol eden metot
   static boolean iSPalindrom(int number){
       int temp = number , lastNumber = 0, reverseNumber = 0;
       //Kullanıcı tarafından girilen sayı 0 olmadığı sürece son basamağına ulaşmak için modunu alıyoruz.
       while(temp != 0){
           lastNumber = temp%10;
           //Girilen sayının palindrom olup olmadığını kontrol etmek için reverseNumber adında bir değişken tanımlıyoruz ve girilen sayının son basamağını bu sayıya ekliyoruz.
           reverseNumber = (reverseNumber*10)+lastNumber;
           //Kullanıcı tarafından girilen sayının bir üst basamağına erişmek için sayıyı 10'a bölüyoruz.
           temp /= 10;
       }
       //Kullanıcı tarafından girilen sayı reverseNumbere eşitse true , eşit değilse false değeri döndürülecek
       if(number == reverseNumber){
           return true;
       }
       else{
           return false;
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Kullancıdan sayı girmesini istedim.
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        //isPalindrom metodu true değerini döndürürse bu kod bloğu çalışacak
        if(iSPalindrom(number)){
            System.out.println(number + " Sayısı Bir Palindrom Sayısıdır...");
        }
        //isPalindrom metodu false değerini döndürürse bu kod bloğu çalışacak
        else{
            System.out.println(number + " Sayısı Bir Palindrom Sayısı Değildir...");
        }
    }
    
}
