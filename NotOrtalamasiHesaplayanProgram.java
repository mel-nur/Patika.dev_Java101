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
public class NotOrtalamasiHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // I defined variables as course name
        int mat , physical , chemical , turkce , history , music ;

        //I asked the user to enter lecture notes
        System.out.print("Maths Note: ");
        mat = input.nextInt();
        System.out.print("Physical Note: ");
        physical = input.nextInt();
        System.out.print("Chemical Note: ");
        chemical = input.nextInt();
        System.out.print("Türkçe Note: ");
        turkce = input.nextInt();
        System.out.print("History Note: ");
        history = input.nextInt();
        System.out.print("Müsic Note: ");
        music = input.nextInt();

        //I added up the course notes entered by the user and divided it by the number of courses.
        double avarage = ( mat + physical + chemical + turkce + history + music)/6;

        //I printed the resulting average on the screen.
        System.out.println("Avarage : "+avarage);

        //If the calculated average is greater than or equal to 60, you proceed to the screen; if it is less than 60, you remain on the screen. It will be printed.
        String result = avarage >= 60 ? "You Passed" : "You Stayed";
        System.out.println(result);

    }
}
