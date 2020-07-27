/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_03;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class EXO_34_bis_Refactor_matrice_non_carre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner reader = new Scanner(System.in);
       
       int nl, nc, i, j;
       int[][] tab1 ,tab2, tab3;
       
       System.out.print("Saisissez un nombre de ligne : ");
       nl=reader.nextInt();
       
       System.out.print("Saisissez un nombre de colonne : ");
       nc=reader.nextInt();
       
       tab1 = getMat(nl, nc);
       System.out.println("Tableau complété" );
       
       tab2 = getMat(nl, nc);
       System.out.println("Tableau 2 complété");

       tab3 = additionMatrice(tab1,tab2);
       
       System.out.println("Le résultat est: ");
       AffichTab(tab3);
                  
    }
    

    public static int[][] getMat(int a, int b) {
        Scanner reader = new Scanner(System.in);
        int i,j;
        int[][] tab = new int[a][b];
               
        for(i=0; i<a ; i++){
           for (j=0; j<b; j++){
               System.out.print("Saisissez un nombre tableau: ");
               tab[i][j]=reader.nextInt();
           } 
       } 
        return tab;
    }
   
     public static int[][] additionMatrice(int[][] tableau1, int[][] tableau2) {
        
        int i,j;
        int n=tableau1.length;
        int m=tableau1[0].length;
        int [][] somme= new int[n][m];
        
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                somme[i][j] = tableau1[i][j]+ tableau2[i][j];
             }
        }
        return somme; 
        
     }
     
     
     
     public static void AffichTab(int[][] tab){
        int n=tab.length;
        int m=tab[0].length;
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
     /* public static void AfficheMessage(String msg){
          System.out.printf("%taille*** %s ***%n",msg)
      }*/
    }
    

