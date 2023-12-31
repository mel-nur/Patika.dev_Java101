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
public class ManavKasaProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pearf = 2.14 , applef = 3.67 , tomatoesf = 1.11 , bananaf = 0.95 , eggplantf = 5;
        double peark , applek , tomatoesk , bananak , eggplantk;
        
        //I asked the user to enter how much weight she gained.
        System.out.print("How many kilos of pears? : ");
        peark = input.nextDouble();
        System.out.print("How many kilos of apple? : ");
        applek = input.nextDouble();
        System.out.print("How many kilos of tomatoes? : ");
        tomatoesk = input.nextDouble();
        System.out.print("How many kilos of banana? : ");
        bananak = input.nextDouble();
        System.out.print("How many kilos of eggplant? : ");
        eggplantk = input.nextDouble();
        
        //I calculated the total free
        double total = (pearf*peark)+(applef*applek)+(tomatoesf*tomatoesk)+(bananaf*bananak)+(eggplantf*eggplantk);
        
        //I printed the total fee on the screen.
        System.out.println("Total Free : " +total);
    }
}

