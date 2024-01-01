/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kosulluİfadeler;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SinifiGecmeDurumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int mat , fizik , turkce , kimya , muzik , dersSayisi = 5;
        
        //Kullanıcıdan matematik , fizik , türkçe , kimya , müzik notlarını girmesini istedim
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        //Girilen notlar 0-100 arasında değilse ortalamaya dahil edilemeyeck
        if(mat<0 || mat>100){
            mat = 0;
            dersSayisi--;
        }
        if(fizik<0 || fizik>100){
            fizik = 0;
            dersSayisi--;
        }
        if(turkce<0 || turkce>100){
            turkce = 0;
            dersSayisi--;
        }
        if(kimya<0 || kimya>100){
            mat = 0;
            dersSayisi--;
        }
        if(muzik<0 || muzik>100){
            muzik = 0;
            dersSayisi--;
        }
        
        //Girilen ders notlarını toplayıp ders sayısına bölerek ortalamayı buldum.
        double ort = (mat + fizik + turkce + kimya + muzik)/dersSayisi;

        //Ortalama 0-55 arasındaysa 'Sınıfta kaldınız' yazısı ekrana batırılacak
        if(ort>=0 || ort<55){
            System.out.println("Sınıfta Kaldınız");
        }
        //Ortalama 55-100 arasındaysa 'Sınıfı Geçtiniz' yazısı ekrana bastırılacak
        else if(ort>=55 || ort<100){
            System.out.println("Sınıfı Geçtiniz");
        }
        
        //Hesaplanan ortalama değerini ekrana bastırdım.
        System.out.println("Ortalamanız : " +ort );


    }
}
