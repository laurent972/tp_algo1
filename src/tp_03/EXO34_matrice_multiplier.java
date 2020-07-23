
package tp_03;

import java.util.Scanner;


public class EXO34_matrice_multiplier {

  
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       
       int taille; // taille du tableau
       int n, i, j;
       int[][] tab1 ,tab2;
       
       System.out.print("Saisissez la taille des tableau : ");
       taille=reader.nextInt();
       
       tab1 = new int [taille][taille];
       tab2 = new int [taille][taille];
       
       for(i=0; i<tab1.length ; i++){
           for (j=0; j<tab1.length; j++){
               System.out.print("Saisissez un nombre pour le 1er tableau: ");
               tab1[i][j]=reader.nextInt();
           } 
       }
       
       for(i=0; i<tab2.length ; i++){ 
           for (j=0; j<tab2.length; j++){
               System.out.print("**** Saisissez un nombre pour le 2eme tableau: ");
               tab2[i][j]=reader.nextInt();
           } 
       }   
       
    }
     public static int[][] additionMatrice(int[][] tableau1, int[][] tableau2) {
        
        int somme=0,i,j;
        int[][] tab;
        int n=tab.length;
        tab = new int[n][n];
        
        for(i=0; i<tab.length; i++){
            for(j=0; j<tab.length; j++){
                somme = tableau1[i][j]+ tableau2[i][j];
                somme= tab[i][j];
            }
        }
        
        for(i=0; i<tab.length; i++){
            System.out.println();
            for(j=0; j<tab.length; j++){
                 System.out.print((tab[i][j]) + "\t"); 
            }
        }
        
        return tab; 
        
     }
    
    
}
