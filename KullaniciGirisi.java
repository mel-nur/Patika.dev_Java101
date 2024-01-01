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
public class KullaniciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String userName , password , sifreCevap ;
        //Kullanıcıdan sisteme giriş yapabilmesi için Kullanıcı adını istedim.
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        //Kullanıcıdan sisteme giriş yapabilmesi için şifresini girmesini istedim.
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();
        
        //Kullanıcı adı 'MelikeNur' şifresi 'Çotak' ise 'sisteme başarılı bir giriş yaptınız' yazısı ekrana barıtırılacak
        if(userName.equals("MelikeNur")){
            if(password.equals("Çotak")){
                System.out.println("Sisteme Başarılı Bir Giriş Yaptınız");
            }
            
            //Kullanıcı adı veya şifre hatalı ise 'Hatalı giriş yaptınız' yazısı ekrana batırılacak ve kullanıcıya şifresini sıfırlamak isteyip istemediği sorulacak
            else{
                System.out.print("Hatalı Giriş Yapatınız\n Şifrenizi Sıfırlamak İster Misiniz ? Evet/Hayır :");
                sifreCevap = input.next();
                
                //Kullanıcı evet cevabını girerse , yeni şifresini girmesini isteyecek
                if(sifreCevap.equals("Evet")){
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    String newPassword = input.next();
                    
                    //Eski şifresini girerse ekrana 'şifre oluşturulamadı' yazısı bastırılacak
                    if(newPassword.equals(password) || newPassword.equals("Çotak")){
                        System.out.println("Şifre Oluşturulamadı");
                    }
                    else{
                        System.out.println("Şifre Oluşturuldu");
                }

            }
                //Kullanıcı hayır cevabını girerse 'şifre oluşturma işlemi iptal edildi' yazısı ekrana bastırılacak
                else if (sifreCevap.equals("Hayır")) {
                    System.out.println("Şifre Oluşturma İşlemi İptal Edildi");

                }
                //Kullanıcı evet veya hayır cevabından başka bir cevap girerse ekrana 'lütfen geçerli parametre giriniz' yazısı bastırılacak
                else
            System.out.println("Lütfen Geçerli Parametre Giriniz");
        }


    }
        else {
            System.out.println("Hatalı Kullanıcı Girişi");
        }




    }

}

