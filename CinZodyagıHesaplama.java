/*
 Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 */
package Kosulluİfadeler;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CinZodyagıHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year , result;
        
        //Kullanıcıdan doğum yılını girmesini istedim
        System.out.print("Doğum yılınızı giriniz : ");
        year = input.nextInt();
        
        //Kullanıcının girdiği doğum yılının 12'ye bölümünden kalan değeri buldum
        result = year%12;
        String burc  = "";

        //Kullanıcının girdiği doğum yılının 12'ye bölümünden kalan değere göre çin zodyağı bulunur
        if(result == 0 ){
            burc = "Maymun";
        }
        else if (result == 1){
            burc = "Horoz";
        }
        else if (result == 2){
            burc = "Köpek";
        }
        else if (result == 3){
            burc = "Domuz";
        }
        else if (result == 4){
            burc = "Fare";
        }
        else if (result == 5){
            burc = "Öküz";
        }
        else if (result == 6){
            burc = "Kaplan";
        }
        else if (result == 7){
            burc= "Tavşan";
        }
        else if (result == 8){
           burc = "Ejderha";
        }
        else if (result == 9){
            burc = "Yılan";
        }
        else if (result == 10){
            burc = "At";
        }
        else if (result == 11){
            burc = "Koyun";
        }
        //Kullanıcının girdiği doğum yılının 12'ye bölümünden kalan değerin çin zodyağındaki karşılığı neyse ekrana o bastırılır
            System.out.println("Çin Zodyağı Burcunuz : " +burc);
    }

}

