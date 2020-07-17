
package tp_01;

import java.util.Scanner;


public class SommeNombresPairs {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       
       int n,i,somme;
       somme=0;
       
       System.out.print("Entrer la valeur d'un nombre entier: ");
       n=reader.nextInt();

       for(i=1; i<=n; i++){
           somme=somme+i*2;       
       }
        
       System.out.println("Resultat :" +somme);
    }
    
}
