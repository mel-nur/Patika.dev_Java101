/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class KdvTutariHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //I defined the variables
        double kdv , kdvlitutar, kdvtutarı, tutar;

        //I asked the user to enter the product amount
        System.out.print("Lütfen tutar giriniz = ");
        tutar = input.nextDouble();

        //If the amount is greater than 0 and less than 1000, we charge 18% VAT, otherwise we charge 8%
        if (tutar>0 && tutar<1000){
            kdv = 0.18;

        }
        else {
            kdv = 0.08;
        }
        
        kdvtutarı = tutar*kdv;
        kdvlitutar = kdvtutarı+tutar;
        System.out.println("KDV = "+kdv);
        System.out.println("KDV Tutarı = " +kdvtutarı);
        System.out.println("KDV'li Fiyatı = "+kdvlitutar);
    }
}