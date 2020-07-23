/*
 Ecrire une procédure qui affiche la table de multiplication d'un entier positif n reçu en paramètre.
Ecrivez ensuite le programme principal qui appelle cette procédure.
Ecrire enfin le tout en Java.
Exemple de sortie sur la console avec n = 7

 */

package tp_03;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class EXO_28_PROCEDURE_Multiplication {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n;
        
        System.out.print("Ecrivez un nombre entier: ");
        n=reader.nextInt();
        
        TableMutltiplication(n);
        
    }
    
    public static void TableMutltiplication(int x) { //on ne retourne pas de valeur. Il faut initialiser x comme prenant la valeur de n
        
        int i, somme;
        
        for(i=1; i<=10; i++){
            System.out.println(i+" x "+x+" = "+i*x);
            
            System.out.printf("%d x %d = %d\n",i, x, x*i);
            
            /* somme=i++*x;
            System.out.println(somme);*/
            
           /*  somme=i*x;
            System.out.println(somme);*/
            
        }   
           
    }
    
}
