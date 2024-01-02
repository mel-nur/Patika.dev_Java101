package Donguler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class AsalSayilariBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayac = 0;
        
        //1-100 arasındaki asal sayıları bulmaya çalışıyorum
        for(int i = 1; i<=100; i++){
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    sayac++;
                    
                }
            }
            if(sayac == 2){
                System.out.print(i+ " , ");
            }
            sayac = 0;
            
        }
    }
    
}
