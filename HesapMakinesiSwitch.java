
package Kosulluİfadeler;
import java.util.Scanner;
public class HesapMakinesiSwitch {
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        int number1 , number2 , select;
        
        //Kullanıcıdan 1. sayıyı girmesini istedim
        System.out.print("Enter the 1st number : ");
        int num1 = input.nextInt();
        
         //kulllanıcıdan 2. sayıyı girmesini istedim
        System.out.print("Enter the 2nd number : ");
        int num2 = input.nextInt();
        
        //Kullanıcıdan toplama , çıkarma , çarpma , bölme işlemlerinden birisini seçmesini istedim
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your Choice : ");
        select = input.nextInt();

        switch (select){
            
            //Kullanıcı 1. işlemi seçerse toplama işlemi yapılacak ve sonuç ekrana yazdırılacak
            case 1 :
                System.out.println("Addition Result =  " + (num1+num2));
                break;
                
            //Kullanıcı 2. işlemi seçerse çıkarma işlemi yapılacak ve sonuç ekrana yazdırılacak
            case 2 :
                System.out.println("Subtraction Result = " + (num1-num2));
                break;
                
            //Kullanıcı 3. işlemi seçerse çarpma işlemi yapılacak ve sonuç ekrana yazdırılacak
            case 3:
                System.out.println("Multiplication Result = " + (num1-num2));
                break;
                
            //Kullanıcı 4. işlemi seçerse bölme işlemi yapılacak ve sonuç ekrana yazdırılacak
            case 4:
                if(num2 != 0){
                    System.out.println("Division Result = "+(num1/num2));
                }
                
                //Payda kısmı eğer 0 girilirse 'sayı sıfıra bölünemez' yazısı ekrana bastırılacak
                else{
                    System.out.println("cannot be divided by 0");
                }
                break;
                
                //Geçersiz bir işlem girilmesi sonucunda 'Geçersiz Bir Seçenek Girdiniz' yazısı ekrana bastırılacak
            default:
                System.out.println("You Entered an Invalid Option");
                break;
        }
    }
}

