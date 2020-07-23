
package tp_03;

import java.util.Scanner;


public class EXO_31_PlusGrandDenominateurCommun {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Saisissez un nombre n: ");
        int n=reader.nextInt();
        
        System.out.print("Saisissez un nombre m: ");
        int m=reader.nextInt();
        
        System.out.println("Le PGCD est: " +fonctionPGCD(n,m));
    }
    
    public static int fonctionPGCD(int a, int b) {
       
       /* int plusGrand , plusPetit;
        while(a != b){
            if(a < b){
                plusGrand = b;
                plusPetit = a;
                plusGrand = plusGrand-plusPetit;
            }else{
                plusGrand = a;
                plusPetit = b;
                plusGrand = plusGrand-plusPetit;
            }
            plusGrand = plusGrand-plusPetit;
        }
        return plusPetit;*/
       
       while(a != b){
           if(a>b){
               a=a-b;
               
           }else{
               b=b-a;
           }
       }
       return a;
    }
    
}
