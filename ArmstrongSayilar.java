package Donguler;

/*
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, 
böyle sayılara Armstrong sayı denir.
*/

/**
 *
 * @author LENOVO
 */
public class ArmstrongSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result = 0 , number = 0;
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                for(int k = 1; k<=9; k++){
                    result = (int)(Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3));
                    number = (i*100)+(j*10)+k;
                    if(number == result){
                       System.out.println(number+" sayısı bir Armstrong sayısıdır");
                   }
                }
            }
        }
       
    }
    
}
