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
public class TaksimetreHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int km;
        double perKm = 2.20 , total , bas = 10;
        
        //I asked the user to enter the km value
        System.out.print("Km Giriniz : ");
        km = input.nextInt();
        
        //I calculated the total fee
        total = km * perKm;
        total += bas;
        
        //The minimum payable amount is 20 TL. For fares under 20 TL, 20 TL will still be charged.
        total = (total<20) ? 20:total;
        System.out.println("Total Fee : " +total);

    }
    
}
