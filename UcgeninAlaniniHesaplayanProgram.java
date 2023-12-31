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
public class UcgeninAlaniniHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a , b , c , area , u;
        
        //I asked the user to enter the sides of the triangle
        System.out.print("Enter one side of the triangle : ");
        a = input.nextDouble();
        System.out.print("Enter one side of the triangle : ");
        b = input.nextDouble();
        System.out.print("BEnter one side of the triangle : ");
        c = input.nextDouble();
        
        //I calculated the perimeter of the triangle
        u = (a+b+c)/2;
        
        //I calculated the area of the triangle
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        //I printed the area of the triangle on the screen
        System.out.println("Area of triangle : "+area);

    }
}