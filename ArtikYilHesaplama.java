/*
 Artık Yıl Nedir?

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), 
normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 
365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
 */
package Kosulluİfadeler;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ArtikYilHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int yil, kalanYuz, kalanDort, kalanDortYuz;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan yıl değerini girmesini istedim
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        kalanYuz = yil % 100;
        kalanDort = yil % 4;

        if (kalanDort == 0) {
            if (kalanYuz == 0) {
                kalanDortYuz = yil % 400;
                if (kalanDortYuz == 0) {
                    System.out.print(yil + " bir artık yıldır !");
                } else {
                    System.out.print(yil + " bir artık yıl değildir !");
                }
            } else {
                System.out.print(yil + " bir artık yıldır !");
            }
        } else {
            System.out.print(yil + " bir artık yıl değildir !");
        }
    }

}