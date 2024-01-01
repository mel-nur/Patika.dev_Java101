/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
package Kosulluİfadeler;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UcakBiletiFiyatiHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age , km , type ;
        double normal_amount , fee =0.10 ;

        //Kullanıcıdan mesafe , yaş , yolculuk tipini girmesini istedim.
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.println("1-)Tek Yön Gidiş\n2-)Gidiş Geliş");
        System.out.print("Yolculuk tipiniz seçiniz : ");
        type = input.nextInt();


        if(km>0 ){
            //Girilen km değeri mesafe başına ücretle çarpılıp tutar hesaplanır
            normal_amount = km * fee;
            
            //Girilen yaş değerine göre indirimler uygulanır
            if(age < 12 && age>0){
                normal_amount = normal_amount -(normal_amount*0.50);
            }
            else if(age>=12 && age<24){
                normal_amount = normal_amount -(normal_amount*0.10);
            }
            else if(age>65){
                normal_amount = normal_amount -(normal_amount*0.30);
            }
            //Seçilen yolculuk tipine göre indirim uygulanır.
            if(type == 1 || type == 2){
                if(type == 2){
                    normal_amount = 2*(normal_amount -(normal_amount*0.20));
                }
            }
            //Ekrana toplam tutar bastırılır
            System.out.println("Toplam Tutar : " +normal_amount);

        }
        //km değişkeni geçersiz bir değer girilirse bu kod bloğu çalışır.
        else{
            System.out.println("Hatalı veri girdiniz...");
        }


    }
}
