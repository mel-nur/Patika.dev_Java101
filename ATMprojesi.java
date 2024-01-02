package Donguler;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ATMprojesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String userName , password;
        int right = 3 , balance = 0, select= 0 , price = 0;
        
        //Kullanıcıya 3 tane hak verildi
        //Kullanıcıdan, kullanıcı adı ve şifresini girmesini istedim.
        while(right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();
            
            //Kullanıcı adı ve şifre doğru girilirse bankada işlem yapılabilecek
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Kodluyoruz bankasına hoşgeldiniz...");
                //Kullanıcıdan hesabındaki para mıktarını girmesini istedim. Girilen para miktarı üzerinden işlemler yapılacak
                System.out.print("Lütfen Hesabınızdaki Para Miktarını Giriniz : ");
                balance = input.nextInt();
                do{
                    //Kullanıcı adı ve şifre doğru girildiği için kullanıcıya yapmak istediği işlemi seçmesini istiyorum
                    System.out.println("1-Para Yatırma \n" + "2-Para Çekme \n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();
                 
                    switch (select) {
                        //Kullanıcı 1. işlemi seçerse yani para yatırmak işlemini seçerse girilen para miktarı , mevcut parayla toplanıp ekrana güncel bakiye bastırılır.
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Para Miktarını Giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            System.err.println("Güncel Bakiyeniz : "+balance);
                            break;
                        //Kullanıcı 2. işlemi yani para çekme işlemini seçerse çekmek istediği para miktarı bankadaki mevcut paradan fazla olup olmadığı kontrol edilir.
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarını Giriniz : ");
                            price = input.nextInt();
                            //Kullanıcı mevcut paradan daha fazla çekmek isterse ekrana bakiye yetersiz yazısı bastırılacak
                            if(price>balance){
                                System.err.println("Bakiye Yetersiz");
                            }
                            //Mevcut para, çekmek istenilen paradan fazlaysa kullanıcı parayı çekebilecek ve ekrana güncel bakiye bastırılacak
                            else{
                                balance -= price;
                                System.err.println("Güncel Bakiyeniz : " +balance);
                            }
                              break;
                        //Kullanıcı 3. işlemi yani bakiye sorgulama işlemini seçerse bankadaki mevcut para ekrana bastırılacak     
                        case 3:
                            System.err.println("Güncel Bakiyeniz : " +balance);
                                
                        default:
                            
                    }
                //Kullanıcı 4. işlemi seçerse bankadan çıkış yapılacak    
                }while(select != 4);
                System.out.println("Tekrar Görüşmek Üzere...");
                break;
               
            }
            //Kullanıcı hatalı girişler yaparsa verilen hak sayısı azalacak
            else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre Lütfen Tekrar Deneyiniz...");
                //Kullanıcı verilen hakların hepsini kullanırsa ekrana hesabınız bloke olmuştur yazısı bastırılacak
                if(right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur...");
                }
                //Ekrana kalan haklar basıtırılacak
                else{
                    System.err.println("Kalan hakkınız : "+right);
                }
            }
        }
    }
    
}
