
package tp_01;

import java.util.Scanner;

public class SommeNombresPairsV2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n,i,somme;
        
        somme=0;
         System.out.print("Ecrire un entier:");
         n=reader.nextInt();
             
        for(i=2;i<=2*n;i=i+2){
            somme=somme+i;
        }
        
        System.out.println("Resultat:" +somme);
        
    }
    
}
