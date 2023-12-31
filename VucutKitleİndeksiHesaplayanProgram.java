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
public class VucutKitleİndeksiHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double height , weight ;
        
        //I asked the user for height and weight values
        System.out.print("Enter your height in meters : ");
        height = input.nextDouble();
        System.out.print("Enter your weight : ");
        weight = input.nextDouble();
        
        //I calculated the body mass index
        double vke = weight / (height*height);
        
        //I printed the body mass index on the screen
        System.out.print("Your Body Mass Index : "+vke);
    }
    
}
