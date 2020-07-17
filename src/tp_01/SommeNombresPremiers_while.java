
package tp_01;

import java.util.Scanner;


public class SommeNombresPremiers_while {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, i, somme;
        somme=0;
        i=1;
        
        System.out.print("entrer une valeur:");
        n=reader.nextInt();
        
        while(i<=n){
            somme=somme+i;
            i++;//Le Pas
        }
        
        System.out.println("Resultat:" +somme);
    }
    
}
