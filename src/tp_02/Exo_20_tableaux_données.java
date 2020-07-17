
package tp_02;

import java.util.Scanner;


public class Exo_20_tableaux_données {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int n=2; //constante
        
        int somme,i;
        double moyenne;
        //creation du tableau
        int[] tab;
        // creation du tableau
        tab = new int[n];
        // lecture du tableau        
        for(i=0; i<n; i++){
            System.out.println("Saisissez un nombre: ");
            tab[i]=reader.nextInt();
        }
        
        // calcul et affichage de la moyenne
        somme=0;
         for(i=0; i<n; i++){
            somme=somme+tab[i];
        }
        moyenne = (double) somme/n;
        System.out.println("La moyenne vaut : " +moyenne);
        
    }
    
}
