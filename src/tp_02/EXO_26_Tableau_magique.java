
package tp_02;

import java.util.Scanner;


public class EXO_26_Tableau_magique {

   
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
               
         int ligne, colonne, x;
         
         System.out.print("Ordre du carré magique impair: ");
         int n = reader.nextInt();
         int[][] cm = new int[n][n];
         
         colonne= n/2;
         ligne= colonne +1;
         cm[ligne][colonne] = 1;
         
         for(x=2; x<=n*n; x++){
          
             if((x-1) %n==0){ // modulo du x precedent qui permet de savoir si pair ou impair
                 ligne=(ligne+2)%n; //modulo permet de rester dans le tableau
             }else{
                 ligne= (ligne+1) %n;
                 colonne=(colonne+1)%n;
             }
             cm[ligne][colonne]=x; //je stock x dans le tableau
         }

          for(int i=0; i<n; i++){ //ne pas oublier d'initialiser i et j 
            System.out.println();
            for (int j=0; j<n; j++){
                System.out.print((cm[i][j]) + "\t"); 
            }
        }
    }
    
}
