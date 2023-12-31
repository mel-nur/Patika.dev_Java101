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
public class DikUcgendeHipotenusBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a , b ;
        double c;
        
        //I requested the side values of the triangle from the user
        System.out.print("Enter one side of the triangle : ");
        a = input.nextInt();
        System.out.print("Enter one side of the triangle : ");
        b = input.nextInt();
        
        //I calculated the hypotenuse
        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));
        
        //I printed the hypotenuse on the screen
        System.out.println("Hipotenüs = " +c);
    }
    
}
