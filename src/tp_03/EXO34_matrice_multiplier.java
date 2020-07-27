
package tp_03;

import java.util.Arrays;
import java.util.Scanner;


public class EXO34_matrice_multiplier {

  
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       
       int taille; // taille du tableau
       int n, i, j;
       int[][] tab1 ,tab2, tab3;
       
       System.out.print("Saisissez la taille des tableau : ");
       taille=reader.nextInt();
       
       tab1 = getMat(taille);
       
       tab2 = getMat(taille);

       tab3 = additionMatrice(tab1,tab2);
       
       
       AffichTab(tab3);
       
       //System.out.println(Arrays.deepToString(tab3));
      /*
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
       }  */
              
    }
    
    
    
  
       public static int[][] getMat(int a) {
        Scanner reader = new Scanner(System.in);
        int i,j;
        int[][] tab = new int[a][a];
               
        for(i=0; i<a ; i++){
           for (j=0; j<a; j++){
               System.out.print("Saisissez un nombre tableau: ");
               tab[i][j]=reader.nextInt();
           } 
       } 
        return tab;
    }
 
    
    
     public static int[][] additionMatrice(int[][] tableau1, int[][] tableau2) {
        
        int i,j;
        int n=tableau1.length;
        int [][] somme= new int[n][n];
        
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                somme[i][j] = tableau1[i][j]+ tableau2[i][j];
             }
        }
        return somme; 
        
     }
     
     
     
     public static void AffichTab(int[][] tab){
        int n=tab.length;
        
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
     /* public static void AfficheMessage(String msg){
          System.out.printf("%taille*** %s ***%n",msg)
      }*/
    
}
