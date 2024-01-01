/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
*/
package Kosulluİfadeler;

import java.util.Scanner;

public class BurcBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Kullanıcıdan doğduğu ay ve günü girmesini istedim.
        System.out.println("1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        System.out.print("Lütfen Doğduğunuz Ayı Seçiniz:");
        int month = input.nextInt();
        System.out.print("Doğduğunuz Gün:");
        int day = input.nextInt();
        String burc;

         boolean isError = false;

         //Girilen ay ve gün değerlerine göre ekrana burc değişkeni bastırılacak
            if(month==1){
                if(day>=1 && day<=31){
                     if (day<=21){
                        burc = "Oğlak";
                        System.out.println("Burcunuz : " +burc);
                }
                     else if (day>=22){
                        burc = "Kova";
                        System.out.println("Burcunuz : " +burc);
                }
            }
                    else{
                        isError = true;
            }
        }

            else if (month==2){
                 if(day>=1 && day<=29){
                      if (day<=19){
                         burc = "Kova";
                         System.out.println("Burcunuz : " +burc);
                }
                      else if (day>=20){
                         burc = "Balık";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==3){
            if(day>=1 && day<=31){
                if (day<=20){
                    burc = "Balık";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=21){
                    burc = "Koç";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==4){
            if(day>=1 && day<=30){
                if (day<=20){
                    burc = "Koç";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=21){
                    burc = "Boğa";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==5){
            if(day>=1 && day<=31){
                if (day<=21){
                    burc = "Boğa";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=22){
                    burc = "İkizler";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==6){
            if(day>=1 && day<=30){
                if (day<=22){
                    burc = "İkizler";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=23){
                    burc = "Yengeç";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==7){
            if(day>=1 && day<=31){
                if (day<=22){
                    burc = "Yengeç";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=23){
                    burc = "Aslan";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==8){
            if(day>=1 && day<=31){
                if (day<=22){
                    burc = "Aslan";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=23){
                    burc = "Başak";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==9){
            if(day>=1 && day<=30){
            if (day<=22){
                burc = "Başak";
                System.out.println("Burcunuz : " +burc);
            }
            else if (day>=23){
                burc = "Terazi";
                System.out.println("Burcunuz : " +burc);
            }
        }
        else{
            isError = true;
        }
    }

        else if(month==10){
            if(day>=1 && day<=31){
                if (day<=22){
                    burc = "Terazi";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=23){
                    burc = "Akrep";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==11){
            if(day>=1 && day<=30){
                if (day<=21){
                    burc = "Akrep";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=22){
                    burc = "Yay";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }

        else if(month==12){
            if(day>=1 && day<=31){
                if (day<=21){
                    burc = "Yay";
                    System.out.println("Burcunuz : " +burc);
                }
                else if (day>=22){
                    burc = "Oğlak";
                    System.out.println("Burcunuz : " +burc);
                }
            }
            else{
                isError = true;
            }
    }
        //Geçersiz değerler girilirse bu kod bloğu çalışacak
        if(isError){
            System.out.println("Geçersiz değerler girdiniz. Lütfen tekrar deneyiniz...");
        }


}

}

